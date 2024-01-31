package com.emertozd.pokeql.features.detail.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.toBitmap
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.palette.graphics.Palette
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.emertozd.pokeql.core.ui.theme.PokeQlTheme
import com.emertozd.pokeql.core.ui.views.ErrorAnim
import com.emertozd.pokeql.core.ui.views.ProgressIndicator
import com.emertozd.pokeql.features.detail.ui.mapper.toUIModel
import com.emertozd.pokeql.features.detail.ui.model.PokemonDetailArgModel
import com.emertozd.pokeql.features.detail.ui.views.PokemonTypeLayout
import com.emertozd.pokeql.features.detail.ui.views.StatProgressBar
import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import com.emertozd.pokeql.features.detail.domain.model.PokemonType
import com.emertozd.pokeql.features.detail.domain.model.StatDomainModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph


@RootNavGraph(start = true)
@Destination
@Composable
fun PokemonDetailScreen(
    pokemonDetailArgModel: PokemonDetailArgModel? = null,
    viewModel: PokemonDetailViewModel = hiltViewModel(),
) {
    viewModel.getPokemonDetail(pokemonDetailArgModel?.id ?: 0)
    PokemonDetailScreen(viewModel)
}


@Composable
private fun PokemonDetailScreen(viewModel: PokemonDetailViewModel) {
    val uiState by viewModel.uiStateFlow.collectAsStateWithLifecycle()
    when (uiState) {
        is PokemonDetailViewModel.UiState.Loading -> {
            ProgressIndicator()
        }

        is PokemonDetailViewModel.UiState.Content -> {
            val pokemonModel = (uiState as PokemonDetailViewModel.UiState.Content).pokemonDetail
            PokemonDetailLayout(pokemonModel)

        }

        is PokemonDetailViewModel.UiState.Error -> {
            ErrorAnim((uiState as PokemonDetailViewModel.UiState.Error).errorText)
        }
    }

}

@Composable
fun PokemonDetailLayout(
    pokemon: PokemonDetailDomainModel
) {

    var secondaryColor: Int by rememberSaveable { mutableIntStateOf(Color.Transparent.toArgb()) }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(secondaryColor), Color.Transparent),
                        center = Offset(500f, 400f),
                        radius = 700f,
                        tileMode = TileMode.Decal
                    ),
                )
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/${pokemon.id}.svg")
                    .decoderFactory(SvgDecoder.Factory())
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_silhoutte),
                contentDescription = null,
                modifier = Modifier
                    .size(300.dp)
                    .padding(top = 32.dp)
                    .align(Alignment.CenterHorizontally),
                onSuccess = {
                    Palette.Builder(it.result.drawable.toBitmap()).generate { palette ->
                        palette?.dominantSwatch?.rgb?.let { color ->
                            secondaryColor = color
                        }
                    }
                }
            )

            Text(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .align(Alignment.CenterHorizontally),
                text = pokemon.name.orEmpty(),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.headlineMedium
            )

            pokemon.types?.let {
                PokemonTypeLayout(
                    it,
                    Modifier
                        .padding(top = 32.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
            Text(
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally),
                text = pokemon.description.orEmpty(),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium
            )

            pokemon.stats?.let { list ->
                list.forEach { stat ->
                    Spacer(modifier = Modifier.size(8.dp))
                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        StatProgressBar(
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                            statUIModel = stat.toUIModel(),
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewPokemonDetailLayout() {
    PokeQlTheme {
        PokemonDetailLayout(
            PokemonDetailDomainModel(
                id = 1,
                name = "Pikachu",
                baseExperience = 1,
                height = 1,
                isDefault = true,
                order = 1,
                weight = 1,
                types = listOf(PokemonType.LIGHTNING, PokemonType.GRASS),
                description = "Bulbasaur can be seen napping in bright sunlight.There is a seed on its back. By soaking up the sun’s rays,the seed grows progressively larger.",
                stats = listOf(
                    StatDomainModel(
                        stat = 100,
                        effort = 1,
                        name = "HP "
                    ),
                    StatDomainModel(
                        stat = 20,
                        effort = 1,
                        name = "ATK"
                    ),
                    StatDomainModel(
                        stat = 30,
                        effort = 1,
                        name = "DEF"
                    ),
                    StatDomainModel(
                        stat = 40,
                        effort = 1,
                        name = "SATK"
                    ),
                    StatDomainModel(
                        stat = 50,
                        effort = 1,
                        name = "SDEF"
                    ),
                    StatDomainModel(
                        stat = 60,
                        effort = 1,
                        name = "SPE"
                    ),
                )
            )
        )
    }
}
