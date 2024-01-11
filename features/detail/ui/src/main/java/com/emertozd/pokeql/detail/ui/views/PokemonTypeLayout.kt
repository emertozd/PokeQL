package com.emertozd.pokeql.detail.ui.views

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.core.ui.theme.PokeQlColorPalette
import com.core.ui.theme.PokeQlTheme
import com.emertozd.pokeql.detail.ui.util.backgroundColor
import com.emertozd.pokeql.detail.ui.util.icon
import com.features.detail.domain.model.PokemonType

@Composable
fun PokemonTypeLayout(type: List<PokemonType>, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        type.forEach {

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(it.backgroundColor())
                    .align(Alignment.CenterVertically)
            ) {
                Image(
                    modifier = Modifier
                        .size(32.dp)
                        .padding(4.dp),
                    imageVector = it.icon(),
                    colorFilter = ColorFilter.tint(PokeQlColorPalette.current.type),
                    contentDescription = null,
                )

                Text(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .align(Alignment.CenterVertically),
                    text = it.name,
//                    color = it.textColor(),
                    color = PokeQlColorPalette.current.type,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, backgroundColor = 0xFFFFFFFF)
@Composable
fun PreviewPokemonTypeLayout() {
    PokeQlTheme {
        Surface {
            Column {
                PokemonTypeLayout(listOf(PokemonType.LIGHTNING, PokemonType.GRASS))
                PokemonTypeLayout(listOf(PokemonType.DRAGON, PokemonType.FIRE))
                PokemonTypeLayout(listOf(PokemonType.WATER, PokemonType.PSYCHIC))
                PokemonTypeLayout(listOf(PokemonType.METAL, PokemonType.FIGHTING))
                PokemonTypeLayout(listOf(PokemonType.DARKNESS, PokemonType.COLORLESS))
                PokemonTypeLayout(listOf(PokemonType.FAIRY, PokemonType.FLYING))
                PokemonTypeLayout(listOf(PokemonType.GHOST, PokemonType.GROUND))
                PokemonTypeLayout(listOf(PokemonType.ICE, PokemonType.POISON))
                PokemonTypeLayout(listOf(PokemonType.ROCK, PokemonType.BUG))
            }
        }
    }
}