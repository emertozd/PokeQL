package com.features.home.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.core.ui.theme.PokeQlColorPalette
import com.emertozd.pokeql.home.ui.R
import com.features.home.ui.model.PokemonUiModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Suppress("LongMethod")
@Composable
fun PokemonListItem(
    modifier: Modifier = Modifier,
    pokemon: PokemonUiModel,
    onItemClick: () -> Unit,
) {

    var backgroundColor: Int? by rememberSaveable { mutableStateOf(null) }
    val scope = rememberCoroutineScope()

    Card(
        modifier = modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable { onItemClick.invoke() },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PokeQlColorPalette.current.cardBackground,
        )
    ) {
        ConstraintLayout(
            modifier = modifier
                .background( backgroundColor?.let { Color(it) }
                    ?: MaterialTheme.colorScheme.surfaceVariant)
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            val (
                image,
                ticker,
            ) = createRefs()

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/${pokemon.id}.svg")
                    .decoderFactory(SvgDecoder.Factory())
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                    },
                placeholder = painterResource(R.drawable.ic_silhoutte),
                onSuccess = {
                    scope.launch(Dispatchers.IO) {
                        if(pokemon.name == "fearow") {
                            println("Bulbasaur")
                        }
                        Palette.Builder(it.result.drawable.toBitmap()).generate { palette ->
                            palette?.dominantSwatch?.rgb?.let { color ->
//                                var hsv = FloatArray(3)
//                                android.graphics.Color.colorToHSV(color, hsv)
//                                hsv[2] *= 0.75f // value component
//                                backgroundColor = Color(android.graphics.Color.HSVToColor(hsv)).copy(alpha = 0.8f).toArgb()
                                backgroundColor = Color(color).copy(alpha = 0.2f).toArgb()
//                                backgroundColor = Color(color).copy(alpha = 0.2f).toArgb()
                            }
                        }
                    }
                }
            )


            Text(
                modifier = Modifier
                    .constrainAs(ticker) {
                        top.linkTo(image.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                    },
                textAlign = TextAlign.Center,
                text = pokemon.name.orEmpty(),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.labelLarge
            )

        }

    }

}

val ColorSaver = run {
    val redKey = "Red"
    val greenKey = "Green"
    val blueKey = "Blue"
    mapSaver(
        save = { mapOf(redKey to it.red, greenKey to it.green, blueKey to it.blue) },
        restore = {
            Color(
                red = it[redKey] as Float,
                green = it[greenKey] as Float,
                blue = it[blueKey] as Float
            )
        }
    )
}

@Composable
@Preview
fun PokemonItemPreview() {
    MaterialTheme() {
        PokemonListItem(
            pokemon = PokemonUiModel(
                id = 2,
                name = "Balbasaur",

            ),
            onItemClick = {}
        )
    }
}