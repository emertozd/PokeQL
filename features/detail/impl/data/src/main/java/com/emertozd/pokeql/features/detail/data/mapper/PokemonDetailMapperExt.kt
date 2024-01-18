package com.emertozd.pokeql.features.detail.data.mapper

import com.emertozd.pokeql.PokemonDetailQuery
import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import com.emertozd.pokeql.features.detail.domain.model.PokemonType
import com.emertozd.pokeql.features.detail.domain.model.StatDomainModel

fun PokemonDetailQuery.Pokemon_v2_pokemon.toDomainModel(): PokemonDetailDomainModel {

    return PokemonDetailDomainModel(
//        abilities = this.abilities?.mapNotNull { it?.toDomainModel() },
        baseExperience = this.base_experience,
//        forms = this.forms?.mapNotNull { it?.toDomainModel() },
        height = this.height,
        id = this.id,
        isDefault = this.is_default,
        name = this.name,
        order = this.order,
        stats = this.pokemon_v2_pokemonstats.map { it.toDomainModel() },
//        types = this.types?.mapNotNull { it?.toDomainModel() },
        weight = this.weight,
        description = this.pokemon_v2_pokemonspecy?.pokemon_v2_pokemonspeciesflavortexts?.firstOrNull()?.flavor_text?.replace(
            "\n",
            " "
        ),
        types = this.pokemon_v2_pokemontypes.map { PokemonType.fromString(it.pokemon_v2_type?.name) },

        )
}

private fun PokemonDetailQuery.Pokemon_v2_pokemonstat.toDomainModel(): StatDomainModel {
    return StatDomainModel(
        stat = this.base_stat,
        effort = this.effort,
        name = this.pokemon_v2_stat?.name
    )

}