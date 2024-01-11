package com.emertozd.pokeql.detail.ui

import androidx.compose.runtime.Immutable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.domain.model.Result
import com.features.detail.domain.model.PokemonDetailDomainModel
import com.features.detail.domain.usecase.GetPokemonDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val getPokemonDetailUseCase: GetPokemonDetailUseCase,
) : ViewModel() {

    private val _event = Channel<Event>(Channel.BUFFERED)
    val event = _event.receiveAsFlow()

    private val _uiStateFlow = MutableStateFlow<UiState>(UiState.Loading)
    internal val uiStateFlow = _uiStateFlow.asStateFlow()

    fun getPokemonDetail(id: Int) {
        if (uiStateFlow.value is UiState.Content) return
        viewModelScope.launch {
            _uiStateFlow.update { UiState.Loading }
            getPokemonDetailUseCase.execute(id).onEach { result ->
                when (result) {
                    is Result.Success -> {
                        _uiStateFlow.update { UiState.Content(pokemonDetail = result.data) }
                    }

                    is Result.Error -> handleError(result)
                }
            }.launchIn(viewModelScope)
        }
    }


    private fun handleError(error: Result.Error<*>) {
        viewModelScope.launch {
            _uiStateFlow.update { UiState.Error(error.errorMessage) }
            _event.send(Event.ShowToast(error.errorMessage))
        }
    }

    sealed interface Event {
        data class ShowToast(val message: String) : Event
    }


    @Immutable
    sealed interface UiState {
        data class Content(val pokemonDetail: PokemonDetailDomainModel) : UiState
        object Loading : UiState
        data class Error(val errorText: String) : UiState
    }
}