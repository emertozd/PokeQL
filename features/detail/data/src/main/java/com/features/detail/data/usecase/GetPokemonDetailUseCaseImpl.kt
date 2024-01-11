package com.features.detail.data.usecase

//import com.features.detail.data.mapper.toDomainModel
import com.core.domain.model.Result
import com.features.detail.data.mapper.toDomainModel
import com.features.detail.data.repository.DetailRepository
import com.features.detail.domain.model.PokemonDetailDomainModel
import com.features.detail.domain.usecase.GetPokemonDetailUseCase
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