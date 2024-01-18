package com.emertozd.pokeql.features.detail.data.usecase

import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.features.detail.data.mapper.toDomainModel
import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import com.emertozd.pokeql.features.detail.domain.repository.DetailRepository
import com.emertozd.pokeql.features.detail.domain.usecase.GetPokemonDetailUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetPokemonDetailUseCaseImpl @Inject constructor(private val detailRepository: DetailRepository) :
    GetPokemonDetailUseCase {
    override fun execute(id: Int): Flow<Result<PokemonDetailDomainModel>> =
        detailRepository.getPokemonDetail(id).map { getPokemonDetailResult ->
            when (getPokemonDetailResult) {
                is Result.Success -> {
                    Result.Success(
                        getPokemonDetailResult.data.pokemon_v2_pokemon.first().toDomainModel()
                    )
                }

                is Result.Error -> Result.Error(getPokemonDetailResult.errorMessage)
            }
        }
}