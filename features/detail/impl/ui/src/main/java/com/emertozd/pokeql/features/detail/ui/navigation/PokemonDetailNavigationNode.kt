package com.emertozd.pokeql.features.detail.ui.navigation

import com.emertozd.pokeql.core.ui.navigation.NavigationNode
import com.emertozd.pokeql.features.detail.ui.PokemonDetailNavGraph
import com.ramcosta.composedestinations.spec.NavGraphSpec
import javax.inject.Inject

class PokemonDetailNavigationNode @Inject constructor() : NavigationNode {
    override fun getSpec(): NavGraphSpec {
        return PokemonDetailNavGraph
    }
}