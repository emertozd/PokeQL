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

public val TypeIcon.Ground: ImageVector
    get() {
        if (_ground != null) {
            return _ground!!
        }
        _ground = Builder(name = "Ground", defaultWidth = 255.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 255.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(85.754f, 150.959f)
                curveTo(85.711f, 150.959f, 85.681f, 150.917f, 85.695f, 150.876f)
                lineTo(125.983f, 48.041f)
                curveTo(125.992f, 48.016f, 126.015f, 48.0f, 126.042f, 48.0f)
                horizontalLineTo(177.049f)
                curveTo(177.075f, 48.0f, 177.099f, 48.017f, 177.108f, 48.042f)
                lineTo(216.797f, 150.877f)
                curveTo(216.811f, 150.917f, 216.781f, 150.959f, 216.738f, 150.959f)
                horizontalLineTo(85.754f)
                close()
                moveTo(38.062f, 151.405f)
                curveTo(38.019f, 151.405f, 37.989f, 151.362f, 38.004f, 151.321f)
                lineTo(69.004f, 71.228f)
                curveTo(69.013f, 71.204f, 69.036f, 71.188f, 69.062f, 71.188f)
                horizontalLineTo(95.129f)
                curveTo(95.172f, 71.188f, 95.202f, 71.231f, 95.187f, 71.271f)
                lineTo(65.178f, 151.364f)
                curveTo(65.169f, 151.388f, 65.146f, 151.405f, 65.12f, 151.405f)
                horizontalLineTo(38.062f)
                close()
            }
        }
        .build()
        return _ground!!
    }

private var _ground: ImageVector? = null
