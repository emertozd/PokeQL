package com.core.ui.navigation

import androidx.navigation.NavHostController
import javax.inject.Inject

class NavControllerHolder @Inject constructor() {

    private var navController: NavHostController? = null

    fun setController(controller: NavHostController) {
        navController = controller
    }

    fun getController(): NavHostController? {
        return navController
    }
}