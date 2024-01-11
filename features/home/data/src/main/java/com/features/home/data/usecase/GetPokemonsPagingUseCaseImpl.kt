package com.features.home.data.usecase

import com.core.domain.model.Result
import com.features.home.data.mapper.toDomainModel
import com.features.home.data.repository.HomeRepository
import com.features.home.domain.model.PokemonsQueryDomainModel
import com.features.home.domain.usecase.GetPokemonsPagingUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetPokemonsPagingUseCaseImpl @Inject constructor(private val homeRepository: HomeRepository) :
    GetPokemonsPagingUseCase {
    override fun execute(limit: Int, offset: Int): Flow<Result<PokemonsQueryDomainModel>> {
        return homeRepository.getPokemons(limit, offset).map { result ->
            when (result) {
                is Result.Success -> {
                    Result.Success(result.data.toDomainModel())
                }

                is Result.Error -> {
                    Result.Error(result.errorMessage)
                }
            }
        }
    }
}