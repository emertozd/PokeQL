package com.emertozd.pokeql.navigation

import com.core.ui.navigation.NavigationNode
import com.features.home.ui.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

class PokeQLNavGraph(navigationNodes: @JvmSuppressWildcards Set<NavigationNode>) : NavGraphSpec {

        override val route = "root"

        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()

        override val startRoute = HomeScreenDestination

        override val nestedNavGraphs = navigationNodes.map { it.getSpec() }
    }