package com.features.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.core.ui.views.ErrorAnim
import com.core.ui.views.ErrorMessage
import com.core.ui.views.LoadingNextPageItem
import com.core.ui.views.PageLoader
import com.core.ui.views.ProgressIndicator
import com.emertozd.pokeql.detail.shared.model.DetailArguments
import com.features.home.ui.components.PokemonListItem
import com.features.home.ui.model.PokemonUiModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import rememberLazyGridState

@RootNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
) {

    val uiState: HomeViewModel.UiState by viewModel.uiStateFlow.collectAsStateWithLifecycle()
//    var state = rememberLazyGridState(
//        initialFirstVisibleItemIndex = prefs.getInt("scroll_position", 0)
//    )


    uiState.let {
        when (it) {
            is HomeViewModel.UiState.Error -> ErrorAnim(it.errorText)

            HomeViewModel.UiState.Loading -> ProgressIndicator()

            is HomeViewModel.UiState.Content -> {
                val pagingItems: LazyPagingItems<PokemonUiModel> =
                    viewModel.pokemonsState.collectAsLazyPagingItems()

                var state = pagingItems.rememberLazyGridState()

                Box(modifier = Modifier.fillMaxSize()) {

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier,
                        state = state,
                        contentPadding = PaddingValues(horizontal = 8.dp)
                    ) {
                        items(pagingItems.itemCount) { index ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight(),
                            ) {
                                PokemonListItem(
                                    pokemon = pagingItems[index] ?: return@Row,
                                    onItemClick = {
                                        viewModel
                                            .getDetailCommunicator()
                                            .startFeature(
                                                DetailArguments(id = pagingItems[index]?.id ?: 0)
                                            )
                                    }
                                )
                            }

                        }
                        pagingItems.apply {
                            when {


                                loadState.refresh is LoadState.Error -> {
                                    val error =
                                        pagingItems.loadState.refresh as LoadState.Error
                                    item(span = { GridItemSpan(maxLineSpan) }) {
                                        ErrorMessage(
                                            modifier = Modifier,
                                            message = error.error.localizedMessage!!,
                                            onClickRetry = { retry() })
                                    }
                                }

                                loadState.append is LoadState.Loading -> {
                                    item(span = { GridItemSpan(maxLineSpan) }) {
                                        LoadingNextPageItem(
                                            modifier = Modifier
                                        )
                                    }
                                }

                                loadState.append is LoadState.Error -> {
                                    val error = pagingItems.loadState.append as LoadState.Error
                                    item(span = { GridItemSpan(maxLineSpan) }) {
                                        ErrorMessage(
                                            modifier = Modifier,
                                            message = error.error.localizedMessage.orEmpty(),
                                            onClickRetry = { retry() })
                                    }
                                }
                            }
                        }

                    }

                    if (pagingItems.loadState.refresh == LoadState.Loading) {
                        PageLoader(
                            modifier = if (pagingItems.itemCount == 0) {
                                Modifier
                                    .fillMaxSize()
                                    .align(Alignment.Center)
                            } else {
                                Modifier.fillMaxWidth()
                            }
                        )
                    }
                }
            }

        }
    }
}
