package com.features.home.data.repository

import com.core.domain.model.Result
import com.emertozd.pokeql.PokemonListQuery
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    fun getPokemons(limit: Int, offset: Int): Flow<Result<PokemonListQuery.Data>>
}