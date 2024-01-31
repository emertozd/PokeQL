package com.emertozd.pokeql.features.detail.ui.icons.typeicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.emertozd.pokeql.features.detail.ui.icons.TypeIcon

public val TypeIcon.Rock: ImageVector
    get() {
        if (_rock != null) {
            return _rock!!
        }
        _rock = Builder(name = "Rock", defaultWidth = 200.0.dp, defaultHeight = 150.0.dp,
                viewportWidth = 200.0f, viewportHeight = 150.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(145.522f, 71.852f)
                curveTo(145.512f, 71.839f, 145.508f, 71.822f, 145.511f, 71.806f)
                lineTo(156.273f, 9.05f)
                curveTo(156.278f, 9.021f, 156.303f, 9.0f, 156.332f, 9.0f)
                horizontalLineTo(159.738f)
                curveTo(159.764f, 9.0f, 159.787f, 9.017f, 159.795f, 9.042f)
                lineTo(184.042f, 85.813f)
                curveTo(184.05f, 85.837f, 184.041f, 85.863f, 184.022f, 85.879f)
                lineTo(166.144f, 99.837f)
                curveTo(166.117f, 99.858f, 166.079f, 99.852f, 166.059f, 99.825f)
                lineTo(145.522f, 71.852f)
                close()
                moveTo(15.0f, 113.455f)
                curveTo(15.0f, 113.481f, 15.017f, 113.504f, 15.041f, 113.512f)
                lineTo(51.894f, 125.562f)
                curveTo(51.912f, 125.568f, 51.932f, 125.565f, 51.947f, 125.554f)
                lineTo(134.321f, 68.685f)
                curveTo(134.335f, 68.675f, 134.344f, 68.661f, 134.346f, 68.644f)
                lineTo(143.18f, 9.372f)
                curveTo(143.186f, 9.336f, 143.157f, 9.303f, 143.121f, 9.303f)
                horizontalLineTo(70.158f)
                curveTo(70.14f, 9.303f, 70.123f, 9.311f, 70.112f, 9.325f)
                lineTo(15.014f, 75.792f)
                curveTo(15.005f, 75.803f, 15.0f, 75.816f, 15.0f, 75.831f)
                verticalLineTo(113.455f)
                close()
                moveTo(67.251f, 128.632f)
                lineTo(107.512f, 141.82f)
                curveTo(107.53f, 141.826f, 107.55f, 141.823f, 107.566f, 141.812f)
                lineTo(155.499f, 107.429f)
                curveTo(155.526f, 107.41f, 155.532f, 107.374f, 155.514f, 107.347f)
                lineTo(137.545f, 80.608f)
                curveTo(137.526f, 80.58f, 137.489f, 80.573f, 137.461f, 80.592f)
                lineTo(67.251f, 128.632f)
                close()
            }
        }
        .build()
        return _rock!!
    }

private var _rock: ImageVector? = null
