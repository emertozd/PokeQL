package com.emertozd.pokeql.features.detail.ui.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.emertozd.pokeql.core.ui.theme.PokeQlColorPalette
import com.emertozd.pokeql.features.detail.ui.icons.TypeIcon
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Bug
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Colorless
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Darkness
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Dragon
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Fairy
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Fighting
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Fire
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Flying
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Ghost
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Grass
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Ground
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Ice
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Lightning
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Metal
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Poison
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Psychic
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Rock
import com.emertozd.pokeql.features.detail.ui.icons.typeicon.Water
import com.emertozd.pokeql.features.detail.domain.model.PokemonType

@Composable
fun PokemonType.backgroundColor(): Color {
    //PokemonType.LIGHTNING -> PokeQlColorPalette.current.lightning
    return when (this) {
        PokemonType.COLORLESS -> PokeQlColorPalette.current.colorless
        PokemonType.DARKNESS -> PokeQlColorPalette.current.darkness
        PokemonType.FIGHTING -> PokeQlColorPalette.current.fighting
        PokemonType.FIRE -> PokeQlColorPalette.current.fire
        PokemonType.GRASS -> PokeQlColorPalette.current.grass
        PokemonType.LIGHTNING -> PokeQlColorPalette.current.lightning
        PokemonType.METAL -> PokeQlColorPalette.current.metal
        PokemonType.PSYCHIC -> PokeQlColorPalette.current.psychic
        PokemonType.WATER -> PokeQlColorPalette.current.water
        PokemonType.DRAGON -> PokeQlColorPalette.current.dragon
        PokemonType.BUG -> PokeQlColorPalette.current.bug
        PokemonType.FAIRY -> PokeQlColorPalette.current.fairy
        PokemonType.FLYING -> PokeQlColorPalette.current.flying
        PokemonType.GHOST -> PokeQlColorPalette.current.ghost
        PokemonType.GROUND -> PokeQlColorPalette.current.ground
        PokemonType.ICE -> PokeQlColorPalette.current.ice
        PokemonType.POISON -> PokeQlColorPalette.current.poison
        PokemonType.ROCK -> PokeQlColorPalette.current.rock
    }
}

@Composable
fun PokemonType.textColor(): Color {
    return when (this) {
        PokemonType.COLORLESS -> Color.Black
        PokemonType.DARKNESS -> Color.White
        PokemonType.FIGHTING -> Color.Black
        PokemonType.FIRE -> Color.Black
        PokemonType.GRASS -> Color.Black
        PokemonType.LIGHTNING -> Color.Black
        PokemonType.METAL -> Color.Black
        PokemonType.PSYCHIC -> Color.White
        PokemonType.WATER -> Color.Black
        PokemonType.DRAGON -> Color.Black
        PokemonType.BUG -> Color.Black
        PokemonType.FAIRY -> Color.Black
        PokemonType.FLYING -> Color.Black
        PokemonType.GHOST -> Color.White
        PokemonType.GROUND -> Color.Black
        PokemonType.ICE -> Color.Black
        PokemonType.POISON -> Color.White
        PokemonType.ROCK -> Color.Black
    }
}

@Composable
fun PokemonType.icon(): ImageVector {
    return when (this) {
        PokemonType.COLORLESS -> TypeIcon.Colorless
        PokemonType.DARKNESS -> TypeIcon.Darkness
        PokemonType.FIGHTING -> TypeIcon.Fighting
        PokemonType.FIRE -> TypeIcon.Fire
        PokemonType.GRASS -> TypeIcon.Grass
        PokemonType.LIGHTNING -> TypeIcon.Lightning
        PokemonType.METAL -> TypeIcon.Metal
        PokemonType.PSYCHIC -> TypeIcon.Psychic
        PokemonType.WATER -> TypeIcon.Water
        PokemonType.DRAGON -> TypeIcon.Dragon
        PokemonType.BUG -> TypeIcon.Bug
        PokemonType.FAIRY -> TypeIcon.Fairy
        PokemonType.FLYING -> TypeIcon.Flying
        PokemonType.GHOST -> TypeIcon.Ghost
        PokemonType.GROUND -> TypeIcon.Ground
        PokemonType.ICE -> TypeIcon.Ice
        PokemonType.POISON -> TypeIcon.Poison
        PokemonType.ROCK -> TypeIcon.Rock

    }

}