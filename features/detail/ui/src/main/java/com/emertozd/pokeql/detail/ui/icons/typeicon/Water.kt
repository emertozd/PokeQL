package com.emertozd.pokeql.detail.ui.icons.typeicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.emertozd.pokeql.detail.ui.icons.TypeIcon

public val TypeIcon.Water: ImageVector
    get() {
        if (com.emertozd.pokeql.detail.ui.icons.typeicon._water != null) {
            return com.emertozd.pokeql.detail.ui.icons.typeicon._water!!
        }
        com.emertozd.pokeql.detail.ui.icons.typeicon._water = Builder(name = "Water", defaultWidth = 1000.0.dp, defaultHeight = 1000.0.dp,
                viewportWidth = 1000.0f, viewportHeight = 1000.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(635.58f, 230.71f)
                quadTo(618.32f, 274.59f, 627.18f, 321.34f)
                curveTo(631.72f, 345.27f, 640.87f, 368.49f, 652.38f, 390.16f)
                curveTo(667.68f, 418.99f, 687.41f, 446.94f, 707.74f, 473.2f)
                curveTo(730.59f, 502.72f, 754.9f, 532.04f, 776.84f, 562.08f)
                curveTo(792.15f, 583.04f, 806.46f, 605.84f, 815.84f, 629.91f)
                quadTo(832.72f, 673.21f, 838.14f, 711.38f)
                quadTo(843.08f, 746.23f, 839.18f, 776.65f)
                quadTo(831.52f, 836.32f, 791.68f, 880.07f)
                curveTo(769.68f, 904.24f, 741.66f, 922.79f, 710.95f, 936.33f)
                curveTo(664.93f, 956.61f, 612.87f, 966.26f, 561.5f, 967.83f)
                curveTo(472.47f, 970.57f, 383.81f, 951.46f, 304.29f, 913.89f)
                curveTo(240.0f, 883.51f, 182.96f, 840.04f, 140.66f, 783.04f)
                curveTo(102.73f, 731.92f, 80.58f, 671.52f, 75.25f, 607.95f)
                curveTo(71.18f, 559.28f, 74.55f, 509.68f, 86.73f, 463.41f)
                curveTo(98.0f, 420.61f, 116.66f, 379.84f, 141.95f, 343.55f)
                quadTo(175.24f, 295.8f, 219.63f, 257.86f)
                curveTo(293.86f, 194.42f, 383.4f, 150.63f, 475.3f, 118.86f)
                curveTo(548.86f, 93.44f, 625.03f, 74.83f, 701.75f, 61.44f)
                quadTo(790.35f, 45.97f, 880.06f, 39.37f)
                quadTo(899.96f, 37.91f, 918.85f, 37.09f)
                quadTo(923.01f, 36.91f, 925.02f, 37.23f)
                quadTo(925.86f, 37.36f, 925.04f, 37.57f)
                curveTo(898.38f, 44.33f, 871.64f, 52.54f, 844.91f, 62.14f)
                curveTo(808.87f, 75.07f, 774.04f, 90.81f, 741.61f, 110.74f)
                quadTo(682.32f, 147.17f, 647.93f, 205.19f)
                quadTo(641.07f, 216.76f, 635.58f, 230.71f)
                close()
                moveTo(524.99f, 885.51f)
                arcTo(140.67f, 61.07f, 23.1f, false, false, 419.56f, 774.15f)
                arcTo(140.67f, 61.07f, 23.1f, false, false, 266.21f, 775.13f)
                arcTo(140.67f, 61.07f, 23.1f, false, false, 371.64f, 886.49f)
                arcTo(140.67f, 61.07f, 23.1f, false, false, 524.99f, 885.51f)
                close()
            }
        }
        .build()
        return com.emertozd.pokeql.detail.ui.icons.typeicon._water!!
    }

private var _water: ImageVector? = null
