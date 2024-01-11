package com.features.detail.data.repository

import com.core.domain.model.Result
import com.emertozd.pokeql.PokemonDetailQuery
import kotlinx.coroutines.flow.Flow

interface DetailRepository {
    fun getPokemonDetail(id: Int): Flow<Result<PokemonDetailQuery.Data>>
}