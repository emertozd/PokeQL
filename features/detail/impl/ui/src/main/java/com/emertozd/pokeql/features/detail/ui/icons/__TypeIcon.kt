package com.emertozd.pokeql.features.detail.ui.icons

import androidx.compose.ui.graphics.vector.ImageVector
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

public object TypeIcon

private var __AllIcons: List<ImageVector>? = null

public val TypeIcon.AllIcons: List<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = listOf(
            Lightning, Darkness, Dragon, Colorless, Fire, Metal, Fighting, Psychic,
            Water,Fairy, Grass, Ghost, Rock, Bug, Ground, Ice, Flying, Poison
        )
        return __AllIcons!!
    }
