package com.emertozd.pokeql.features.detail.domain.usecase

import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import kotlinx.coroutines.flow.Flow

interface GetPokemonDetailUseCase {
    fun execute(id: Int): Flow<Result<PokemonDetailDomainModel>>
}
