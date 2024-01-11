package com.features.home.ui.mapper

import com.features.home.domain.model.PokemonDomainModel
import com.features.home.ui.model.PokemonUiModel

fun PokemonDomainModel.toUiModel(): PokemonUiModel {
    return with(this) {
        PokemonUiModel(
            id = id,
            name = name,
        )
    }
}

