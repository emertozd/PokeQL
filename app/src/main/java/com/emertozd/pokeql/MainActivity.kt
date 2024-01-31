package com.emertozd.pokeql

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.emertozd.pokeql.core.ui.navigation.NavControllerHolder
import com.emertozd.pokeql.core.ui.navigation.NavigationNode
import com.emertozd.pokeql.core.ui.theme.PokeQlTheme
import com.emertozd.pokeql.core.navigation.PokeQLNavGraph
import com.emertozd.pokeql.features.home.ui.HomeNavGraph
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationNodes: @JvmSuppressWildcards Set<NavigationNode>

    @Inject
    lateinit var navControllerHolder: NavControllerHolder


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeQlTheme {
                val navController = rememberNavController()
                navControllerHolder.setController(navController)
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DestinationsNavHost(
                        modifier = Modifier.padding(it),
                        navController = navController,
                        navGraph = PokeQLNavGraph(navigationNodes),
                        startRoute = HomeNavGraph
                    )
                }
            }
        }
    }
}