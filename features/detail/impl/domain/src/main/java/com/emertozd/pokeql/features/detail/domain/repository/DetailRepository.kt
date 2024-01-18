package com.emertozd.pokeql.features.detail.domain.repository

import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.PokemonDetailQuery
import kotlinx.coroutines.flow.Flow

interface DetailRepository {
    fun getPokemonDetail(id: Int): Flow<Result<PokemonDetailQuery.Data>>
}