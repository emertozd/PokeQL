package com.emertozd.pokeql.detail.ui.util

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val dimen_8dp = 8.dp
val dimen_46dp = 46.dp
val dimen_300dp = 300.dp

@Composable
fun AnimatedProgressBar(indicatorProgress: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .height(dimen_46dp)
            .padding(top = dimen_8dp, bottom = dimen_8dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(dimen_8dp))
        CustomProgressBar(indicatorNumber = indicatorProgress)
    }
}

/**
 * A custom progress bar that displays a linear progress with a customizable indicator.
 *
 * @param indicatorNumber The numeric value representing the progress percentage.
 * @param backgroundIndicatorColor The color of the background indicator.
 * @param indicatorPadding The padding around the progress indicator.
 * @param gradientColors The list of colors to be used for the gradient of the progress indicator.
 * @param animationDuration The duration of the animation for the progress indicator.
 * @param animationDelay The delay before starting the animation for the progress indicator.
 */
@Composable
fun CustomProgressBar(
    indicatorNumber: Int,
    backgroundIndicatorColor: Color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f),
    indicatorPadding: Dp = dimen_8dp,
    gradientColors: List<Color> = listOf(
        MaterialTheme.colorScheme.primary,
        MaterialTheme.colorScheme.outlineVariant,
    ),
    animationDuration: Int = 1000,
    animationDelay: Int = 0
) {
    // Remember the text measurer to optimize text measurement performance.
    val textMeasurer = rememberTextMeasurer()

    // State to animate the progress indicator.
    var percentage by remember {
        mutableFloatStateOf(-1f)
    }

    // Animate the progress number.
    val animateNumber = animateFloatAsState(
        targetValue = percentage,
        animationSpec = tween(
            durationMillis = animationDuration,
            delayMillis = animationDelay
        ), label = ""
    )

    // Trigger the LaunchedEffect to start the animation when the composable is first launched.
    LaunchedEffect(Unit) {
        percentage = indicatorNumber.toFloat()
    }

    // Composable Box to contain the Canvas drawing and text.
    Box(
        modifier = Modifier
            .height(dimen_300dp)
            .fillMaxWidth()
    ) {
        // Canvas drawing for the progress indicator.
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(dimen_300dp)
                .padding(start = indicatorPadding, end = indicatorPadding)
        ) {
            // Draw the background indicator.
            drawLine(
                color = backgroundIndicatorColor,
                cap = StrokeCap.Round,
                strokeWidth = size.height,
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = size.width, y = 0f)
            )

            // Calculate and draw the progress indicator.
            val progress = (animateNumber.value / 100) * size.width
            drawLine(
                brush = Brush.linearGradient(colors = gradientColors),
                cap = StrokeCap.Round,
                strokeWidth = size.height,
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = progress, y = 0f)
            )

            // Draw the progress number in the middle.
            val text = "$indicatorNumber%"
            val textSize = textMeasurer.measure(text = AnnotatedString(text))
            val textWidth = textSize.size.width
            val xOffSet = ((size.width - textWidth) / 2)
            val yOffSet = size.height / 10 - (textSize.size.height / 2)
            drawText(
                textMeasurer = textMeasurer,
                text = text,
                style = TextStyle(
                    color = Color.White,
                    fontSize = (size.height / 2).toSp(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                ),
                topLeft = Offset(x = xOffSet, y = yOffSet)
            )
        }
    }
}