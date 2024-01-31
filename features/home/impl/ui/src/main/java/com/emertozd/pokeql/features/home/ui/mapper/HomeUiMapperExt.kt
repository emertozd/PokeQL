package com.emertozd.pokeql.features.home.ui.mapper

import com.emertozd.pokeql.features.home.domain.model.PokemonDomainModel
import com.emertozd.pokeql.features.home.ui.model.PokemonUiModel

fun PokemonDomainModel.toUiModel(): PokemonUiModel {
    return with(this) {
        PokemonUiModel(
            id = id,
            name = name,
        )
    }
}

