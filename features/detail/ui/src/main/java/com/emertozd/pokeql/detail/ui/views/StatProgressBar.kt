package com.emertozd.pokeql.detail.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.core.ui.theme.PokeQlTheme
import com.emertozd.pokeql.detail.ui.model.StatUIModel

@Composable
fun StatProgressBar(modifier: Modifier, statUIModel: StatUIModel) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth()
            .height(24.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        CustomProgressBar(
            indicatorNumber = statUIModel.stat,
            label = statUIModel.name,
            gradientColors = listOf(statUIModel.color, statUIModel.color.copy(alpha = 0.5f)),
        )
    }
}

@Preview
@Composable
fun StatProgressBarPreview() {
    PokeQlTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surface)
                .verticalScroll(rememberScrollState())
        ) {

            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier,
                    text = "HP",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Start,
                )
                StatProgressBar(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    statUIModel = StatUIModel(
                        name = "hp",
                        effort = 0,
                        stat = 100,
                        color = Color.Red
                    )
                )
            }
        }
    }
}
