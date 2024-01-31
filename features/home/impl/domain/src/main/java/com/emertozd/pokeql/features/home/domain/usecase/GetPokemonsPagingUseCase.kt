package com.emertozd.pokeql.features.home.domain.usecase

import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.features.home.domain.model.PokemonsQueryDomainModel
import kotlinx.coroutines.flow.Flow


interface GetPokemonsPagingUseCase {
    fun execute(limit: Int, offset: Int): Flow<Result<PokemonsQueryDomainModel>>
}
