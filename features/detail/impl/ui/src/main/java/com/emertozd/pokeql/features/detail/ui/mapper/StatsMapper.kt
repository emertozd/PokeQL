package com.emertozd.pokeql.features.detail.ui.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.emertozd.pokeql.core.ui.theme.PokeQlColorPalette
import com.emertozd.pokeql.features.detail.ui.model.StatUIModel
import com.emertozd.pokeql.features.detail.domain.model.StatDomainModel

@Composable
fun StatDomainModel.toUIModel(): StatUIModel {
    return StatUIModel(
        name = when (name) {
            "hp" -> "HP "
            "attack" -> "ATK"
            "defense" -> "DEF"
            "special-attack" -> "SATK"
            "special-defense" -> "SDEF"
            "speed" -> "SPE"
            else -> name ?: ""
        },
        effort = effort ?: 0,
        stat = stat ?: 0,
        color = when (name) {
            "hp" -> PokeQlColorPalette.current.hp
            "attack" -> PokeQlColorPalette.current.attack
            "defense" -> PokeQlColorPalette.current.defense
            "special-attack" -> PokeQlColorPalette.current.specialAttack
            "special-defense" -> PokeQlColorPalette.current.specialDefense
            "speed" -> PokeQlColorPalette.current.speed
            else -> Color.Unspecified
        }
    )
}