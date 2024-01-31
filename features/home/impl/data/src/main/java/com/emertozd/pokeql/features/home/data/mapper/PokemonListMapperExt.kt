package com.emertozd.pokeql.features.home.data.mapper

import com.emertozd.pokeql.PokemonListQuery
import com.emertozd.pokeql.features.home.domain.model.PokemonDomainModel
import com.emertozd.pokeql.features.home.domain.model.PokemonsQueryDomainModel

fun PokemonListQuery.Pokemon_v2_pokemon.toDomainModel(): PokemonDomainModel {
    return PokemonDomainModel(
        id = id,
        name = name,
    )
}

fun PokemonListQuery.Data.toDomainModel(): PokemonsQueryDomainModel {
    return PokemonsQueryDomainModel(
        results = this.pokemon_v2_pokemon.map { it.toDomainModel() }
    )
}

