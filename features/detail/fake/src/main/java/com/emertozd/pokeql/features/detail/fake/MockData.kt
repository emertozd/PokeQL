package com.emertozd.pokeql.features.detail.fake

import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import com.emertozd.pokeql.features.detail.domain.model.PokemonType
import com.emertozd.pokeql.features.detail.domain.model.StatDomainModel

object MockData {
    val mockDetailModel: PokemonDetailDomainModel = PokemonDetailDomainModel(
        baseExperience = 64,
        height = 7,
        id = 1,
        isDefault = true,
        name = "bulbasaur",
        order = 1,
        stats = listOf(
            StatDomainModel(
                name = "hp",
                effort = 0,
                stat = 45
            ),
            StatDomainModel(
                name = "attack",
                effort = 0,
                stat = 49
            ),
            StatDomainModel(
                name = "defense",
                effort = 0,
                stat = 49
            ),
            StatDomainModel(
                name = "special-attack",
                effort = 0,
                stat = 65
            ),
            StatDomainModel(
                name = "special-defense",
                effort = 0,
                stat = 65
            ),
            StatDomainModel(
                name = "speed",
                effort = 1,
                stat = 45
            )
        ),
        weight = 69,
        description = "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
        types = listOf(
            PokemonType.FIRE,
            PokemonType.LIGHTNING,
            PokemonType.COLORLESS
        )
    )
}
