package com.emertozd.pokeql.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorsPalette(
    val blue: Color = Color.Unspecified,
    val lightning: Color = Color.Unspecified,
    val grass: Color = Color.Unspecified,
    val colorless: Color = Color.Unspecified,
    val darkness: Color = Color.Unspecified,
    val fighting: Color = Color.Unspecified,
    val fire: Color = Color.Unspecified,
    val metal: Color = Color.Unspecified,
    val psychic: Color = Color.Unspecified,
    val water: Color = Color.Unspecified,
    val dragon: Color = Color.Unspecified,
    val bug: Color = Color.Unspecified,
    val fairy: Color = Color.Unspecified,
    val flying: Color = Color.Unspecified,
    val ghost: Color = Color.Unspecified,
    val ground: Color = Color.Unspecified,
    val ice: Color = Color.Unspecified,
    val poison: Color = Color.Unspecified,
    val rock: Color = Color.Unspecified,
    val type: Color = Color.Unspecified,
    val cardBackground: Color = Color.Unspecified,
    val hp: Color = Color(0xFFDD324A),
    val attack: Color = Color(0xFFFF6000),
    val defense: Color = Color(0xFF0067E4),
    val specialAttack: Color = Color(0xFFD3AE00),
    val specialDefense: Color = Color(0xFF2FADFD),
    val speed: Color = Color(0xFF00902E),
)

val PokeQlColorPalette = staticCompositionLocalOf { CustomColorsPalette() }


val OnLightCustomColorsPalette = CustomColorsPalette(
    blue = Color(0xFF0013A0),
    lightning = Color(0xFFFFDD69),
    grass = Color(0xFF37A362),
    colorless = Color(0xFFE2DFD5),
    darkness = Color(0xFF59788A),
    fighting = Color(0xFFF07E4B),
    fire = Color(0xFFF03843),
    metal = Color(0xFF98A1A9),
    psychic = Color(0xFF9B4FA4),
    water = Color(0xFF008ED2),
    dragon = Color(0xFFBB9A00),
    bug = Color(0xFF8CB230),
    fairy = Color(0xFFEFA8E4),
    flying = Color(0xFFA890F0),
    ghost = Color(0xFF705898),
    ground = Color(0xFFE2BF65),
    ice = Color(0xFF98D8D8),
    poison = Color(0xFFA040A0),
    rock = Color(0xFFB8A038),
    type = Color(0xFF000000),
    cardBackground = Color(0x00FFFFFF),
)

val OnDarkCustomColorsPalette = CustomColorsPalette(
    blue = Color(0xFF7986CB),
    lightning = Color(0xFFE6B81C),
    grass = Color(0xFF00AB44),
    colorless = Color(0xFF9E9B94),
    darkness = Color(0xFF144968),
    fighting = Color(0xFFF34D02),
    fire = Color(0xFFF03843),
    metal = Color(0xFF98A1A9),
    psychic = Color(0xFF9B4FA4),
    water = Color(0xFF008ED2),
    dragon = Color(0xFFBB9A00),

    bug = Color(0xFF8CB230),
    fairy = Color(0xFFEFA8E4),
    flying = Color(0xFFA890F0),
    ghost = Color(0xFF705898),
    ground = Color(0xFFE2BF65),
    ice = Color(0xFF98D8D8),
    poison = Color(0xFFA040A0),
    rock = Color(0xFFB8A038),
    type = Color(0xFFFFFFFF),
    cardBackground = Color(0xFF888888),
    hp = Color(0xFFDD324A),
    attack = Color(0xFFFF6000),
    defense = Color(0xFF0067E4),
    specialAttack = Color(0xFFD3AE00),
    specialDefense = Color(0xFF2FADFD),
    speed = Color(0xFF00902E),
)

/*
package com.emertozd.pokeql.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorsPalette(
    val blue: Color = Color.Unspecified,
    val lightning: Color = Color.Unspecified,
    val grass: Color = Color.Unspecified,
    val colorless: Color = Color.Unspecified,
    val darkness: Color = Color.Unspecified,
    val fighting: Color = Color.Unspecified,
    val fire: Color = Color.Unspecified,
    val metal: Color = Color.Unspecified,
    val psychic: Color = Color.Unspecified,
    val water: Color = Color.Unspecified,
    val dragon: Color = Color.Unspecified,
    val bug: Color = Color.Unspecified,
    val fairy: Color = Color.Unspecified,
    val flying: Color = Color.Unspecified,
    val ghost: Color = Color.Unspecified,
    val ground: Color = Color.Unspecified,
    val ice: Color = Color.Unspecified,
    val poison: Color = Color.Unspecified,
    val rock: Color = Color.Unspecified,
    val type: Color = Color.Unspecified,
)

val PokeQlColorPalette = staticCompositionLocalOf { CustomColorsPalette() }


val OnLightCustomColorsPalette = CustomColorsPalette(
    blue = Color(0xFF0013A0),
    lightning = Color(0xFFFFD238),
    grass = Color(0xFF00AB44),
    colorless = Color(0xFFF1EDE1),
    darkness = Color(0xFF144968),
    fighting = Color(0xFFF34D02),
    fire = Color(0xFFF03843),
    metal = Color(0xFF98A1A9),
    psychic = Color(0xFF9B4FA4),
    water = Color(0xFF008ED2),
    dragon = Color(0xFFBB9A00),
    bug = Color(0xFF8CB230),
    fairy = Color(0xFFEFA8E4),
    flying = Color(0xFFA890F0),
    ghost = Color(0xFF705898),
    ground = Color(0xFFE2BF65),
    ice = Color(0xFF98D8D8),
    poison = Color(0xFFA040A0),
    rock = Color(0xFFB8A038),
    type = Color(0xFF000000),
    )

val OnDarkCustomColorsPalette = CustomColorsPalette(
    blue = Color(0xFF7986CB),
    lightning = Color(0xFFFFDD69),
    grass = Color(0xFF37A362),
    colorless = Color(0xFFF1EDE1),
    darkness = Color(0xFF144968),
    fighting = Color(0xFFF34D02),
    fire = Color(0xFFF03843),
    metal = Color(0xFF98A1A9),
    psychic = Color(0xFF9B4FA4),
    water = Color(0xFF008ED2),
    dragon = Color(0xFFBB9A00),

    bug = Color(0xFF8CB230),
    fairy = Color(0xFFEFA8E4),
    flying = Color(0xFFA890F0),
    ghost = Color(0xFF705898),
    ground = Color(0xFFE2BF65),
    ice = Color(0xFF98D8D8),
    poison = Color(0xFFA040A0),
    rock = Color(0xFFB8A038),
    type = Color(0xFFFFFFFF),
)
 */