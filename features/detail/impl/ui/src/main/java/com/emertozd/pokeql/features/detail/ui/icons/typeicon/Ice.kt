package com.emertozd.pokeql.features.detail.ui.icons.typeicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.emertozd.pokeql.features.detail.ui.icons.TypeIcon

public val TypeIcon.Ice: ImageVector
    get() {
        if (_ice != null) {
            return _ice!!
        }
        _ice = Builder(name = "Ice", defaultWidth = 200.0.dp, defaultHeight = 180.0.dp,
                viewportWidth = 200.0f, viewportHeight = 180.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.436f, 69.364f)
                lineTo(95.871f, 90.497f)
                lineTo(52.436f, 111.582f)
                lineTo(9.0f, 90.502f)
                lineTo(52.436f, 69.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.621f, 69.364f)
                lineTo(104.186f, 90.497f)
                lineTo(147.621f, 111.582f)
                lineTo(191.057f, 90.502f)
                lineTo(147.621f, 69.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.621f, 15.0f)
                lineTo(104.186f, 37.862f)
                verticalLineTo(82.628f)
                lineTo(104.516f, 82.464f)
                lineTo(105.133f, 82.157f)
                lineTo(147.609f, 61.021f)
                lineTo(147.608f, 61.02f)
                lineTo(147.621f, 61.014f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.621f, 165.946f)
                lineTo(104.186f, 143.084f)
                verticalLineTo(98.318f)
                lineTo(104.516f, 98.482f)
                lineTo(105.133f, 98.789f)
                lineTo(147.609f, 119.925f)
                lineTo(147.608f, 119.926f)
                lineTo(147.621f, 119.932f)
                verticalLineTo(165.946f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.436f, 15.0f)
                lineTo(95.87f, 37.862f)
                verticalLineTo(82.628f)
                lineTo(95.54f, 82.464f)
                lineTo(94.924f, 82.157f)
                lineTo(52.447f, 61.021f)
                lineTo(52.449f, 61.02f)
                lineTo(52.436f, 61.014f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.436f, 165.946f)
                lineTo(95.87f, 143.084f)
                verticalLineTo(98.318f)
                lineTo(95.54f, 98.482f)
                lineTo(94.924f, 98.789f)
                lineTo(52.447f, 119.925f)
                lineTo(52.449f, 119.926f)
                lineTo(52.436f, 119.932f)
                verticalLineTo(165.946f)
                close()
            }
        }
        .build()
        return _ice!!
    }

private var _ice: ImageVector? = null
