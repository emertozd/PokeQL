package com.emertozd.pokeql.features.home.ui.navigation

import com.emertozd.pokeql.core.ui.navigation.NavigationNode
import com.emertozd.pokeql.features.home.ui.HomeNavGraph
import com.ramcosta.composedestinations.spec.NavGraphSpec
import javax.inject.Inject

class HomeNavigationNode @Inject constructor() : NavigationNode {
    override fun getSpec(): NavGraphSpec {
        return HomeNavGraph
    }
}