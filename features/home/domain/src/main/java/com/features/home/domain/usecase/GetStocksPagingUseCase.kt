package com.features.home.domain.usecase

import com.core.domain.model.Result
import com.features.home.domain.model.PokemonsQueryDomainModel
import kotlinx.coroutines.flow.Flow


interface GetPokemonsPagingUseCase {
    fun execute(limit: Int, offset: Int): Flow<Result<PokemonsQueryDomainModel>>
}
