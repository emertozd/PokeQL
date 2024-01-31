package com.emertozd.pokeql.features.home.ui.navigation

import com.emertozd.pokeql.core.ui.navigation.NavControllerHolder
import com.emertozd.pokeql.features.home.shared.HomeCommunicator
import com.emertozd.pokeql.features.home.ui.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.navigation.navigate
import javax.inject.Inject

class HomeCommunicatorImpl @Inject constructor(private val navControllerHolder: NavControllerHolder) :
    HomeCommunicator {
    override fun startFeature() {
        navControllerHolder.getController()?.navigate(HomeScreenDestination())
    }
}