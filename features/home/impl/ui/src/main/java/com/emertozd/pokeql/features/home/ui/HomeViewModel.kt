package com.emertozd.pokeql.features.home.ui

import androidx.compose.runtime.Immutable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.home.domain.model.PokemonDomainModel
import com.emertozd.pokeql.features.home.ui.mapper.toUiModel
import com.emertozd.pokeql.features.home.ui.model.PokemonUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val pagingData: Flow<PagingData<PokemonDomainModel>>,
    private val detailCommunicator: DetailCommunicator,
) : ViewModel() {

    private val _uiStateFlow = MutableStateFlow<UiState>(UiState.Loading)
    internal val uiStateFlow = _uiStateFlow.asStateFlow()

    private val _pokemonsState: MutableStateFlow<PagingData<PokemonUiModel>> =
        MutableStateFlow(value = PagingData.empty())
    val pokemonsState: Flow<PagingData<PokemonUiModel>> get() = _pokemonsState

    init {
        viewModelScope.launch(Dispatchers.IO) {
            pagingData.cachedIn(viewModelScope)
                .collect { data ->
                    _uiStateFlow.update { UiState.Content }
                    _pokemonsState.value = data.map { it.toUiModel() }
                }
        }
    }

    fun getDetailCommunicator(): DetailCommunicator {
        return detailCommunicator
    }

    sealed interface Event {
        data class ShowToast(val message: String) : Event
    }


    @Immutable
    sealed interface UiState {
        object Content : UiState
        object Loading : UiState
        data class Error(val errorText: String) : UiState
    }
}