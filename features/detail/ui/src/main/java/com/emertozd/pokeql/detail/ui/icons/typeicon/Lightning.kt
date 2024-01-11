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

public val TypeIcon.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 720.0.dp, defaultHeight = 1000.0.dp,
                viewportWidth = 720.0f, viewportHeight = 1000.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(418.51f, 498.08f)
                lineTo(46.81f, 613.29f)
                quadTo(45.66f, 613.65f, 46.35f, 612.66f)
                lineTo(451.22f, 38.99f)
                quadTo(452.55f, 37.11f, 451.85f, 39.31f)
                lineTo(338.25f, 399.31f)
                arcTo(0.27f, 0.27f, 0.0f, false, false, 338.59f, 399.65f)
                lineTo(681.37f, 298.19f)
                quadTo(682.27f, 297.92f, 681.8f, 298.73f)
                lineTo(291.39f, 962.69f)
                quadTo(291.28f, 962.87f, 291.27f, 962.66f)
                quadTo(291.22f, 961.69f, 291.48f, 960.74f)
                quadTo(355.12f, 729.51f, 418.74f, 498.3f)
                arcTo(0.18f, 0.18f, 0.0f, false, false, 418.51f, 498.08f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
