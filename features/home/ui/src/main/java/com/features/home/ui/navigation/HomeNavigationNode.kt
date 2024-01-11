package com.features.home.ui.navigation

import com.core.ui.navigation.NavigationNode
import com.features.home.ui.HomeNavGraph
import com.ramcosta.composedestinations.spec.NavGraphSpec
import javax.inject.Inject

class HomeNavigationNode @Inject constructor() : NavigationNode {
    override fun getSpec(): NavGraphSpec {
        return HomeNavGraph
    }
}