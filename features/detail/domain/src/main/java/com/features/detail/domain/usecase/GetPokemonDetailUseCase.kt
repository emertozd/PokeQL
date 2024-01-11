package com.features.detail.domain.usecase

import com.core.domain.model.Result
import com.features.detail.domain.model.PokemonDetailDomainModel
import kotlinx.coroutines.flow.Flow

interface GetPokemonDetailUseCase {
    fun execute(id: Int): Flow<Result<PokemonDetailDomainModel>>
}
