package com.emertozd.pokeql.features.detail.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.emertozd.pokeql.core.domain.FakeResultHolder
import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.core.ui.navigation.NavControllerHolder
import com.emertozd.pokeql.core.ui.navigation.NavigationNode
import com.emertozd.pokeql.core.ui.theme.PokeQlTheme
import com.emertozd.pokeql.features.detail.fake.MockData
import com.emertozd.pokeql.features.detail.demo.destinations.DemoScreenDestination
import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.detail.shared.model.DetailArguments
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.dependency
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DemoActivity : ComponentActivity() {

    @Inject
    lateinit var navigationNodes: @JvmSuppressWildcards Set<NavigationNode>

    @Inject
    lateinit var navControllerHolder: NavControllerHolder

    @Inject
    lateinit var fakeResultHolder: FakeResultHolder

    @Inject
    lateinit var detailCommunicator: DetailCommunicator

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
                        navGraph = object : NavGraphSpec {
                            override val route: String = "root"
                            override val destinationsByRoute: Map<String, DestinationSpec<*>> =
                                mapOf(DemoScreenDestination.route to DemoScreenDestination)
                            override val startRoute: DestinationSpec<*> = DemoScreenDestination
                            override val nestedNavGraphs: List<NavGraphSpec> =
                                navigationNodes.map { it.getSpec() }
                        },
                        dependenciesContainerBuilder = {
                            dependency(detailCommunicator)
                            dependency(fakeResultHolder)
                        }
                    )
                }
            }
        }
    }

}

@Destination(start = true)
@Composable
fun DemoScreen(
    detailCommunicator: DetailCommunicator?,
    fakeResultHolder: FakeResultHolder,
) {
    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier.align(Alignment.Center),
        ) {
            ElevatedButton(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    fakeResultHolder.setResult(Result.Success(null))
                    detailCommunicator?.startFeature(DetailArguments(1))
                }
            ) {
                Text(text = "Start Feature With Success")
            }

            ElevatedButton(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .align(Alignment.CenterHorizontally),
                onClick = {
                    fakeResultHolder.setResult(Result.Success(MockData.mockDetailModel.copy(stats = emptyList())))
                    detailCommunicator?.startFeature(DetailArguments(1))
                }
            ) {
                Text(text = "Start Feature With Success but missing stats")
            }

            ElevatedButton(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .align(Alignment.CenterHorizontally),
                onClick = {
                    fakeResultHolder.setResult(Result.Success(MockData.mockDetailModel.copy(stats = emptyList())))
                    detailCommunicator?.startFeature(DetailArguments(1))
                }
            ) {
                Text(text = "Start Feature With Success but missing stats")
            }

            ElevatedButton(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .align(Alignment.CenterHorizontally),
                onClick = {
                    fakeResultHolder.setResult(Result.Error<String>(""))
                    detailCommunicator?.startFeature(DetailArguments(1))
                }
            ) {
                Text(text = "Start Feature With Error")
            }
        }
    }
}


@Preview
@Composable
fun DemoScreenPreview() {
    DemoScreen(detailCommunicator = null, fakeResultHolder = FakeResultHolder())
}