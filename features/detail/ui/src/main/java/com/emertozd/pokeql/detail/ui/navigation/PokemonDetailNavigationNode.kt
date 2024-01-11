package com.emertozd.pokeql.detail.ui.navigation

import com.core.ui.navigation.NavigationNode
import com.emertozd.pokeql.detail.ui.PokemonDetailNavGraph
import com.ramcosta.composedestinations.spec.NavGraphSpec
import javax.inject.Inject

class PokemonDetailNavigationNode @Inject constructor() : NavigationNode {
    override fun getSpec(): NavGraphSpec {
        return PokemonDetailNavGraph
    }
}