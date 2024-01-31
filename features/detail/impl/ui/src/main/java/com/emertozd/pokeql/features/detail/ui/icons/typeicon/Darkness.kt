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

val TypeIcon.Darkness: ImageVector
    get() {
        if (_darkness != null) {
            return _darkness!!
        }
        _darkness = Builder(name = "Darkness", defaultWidth = 1000.0.dp, defaultHeight = 1000.0.dp,
                viewportWidth = 1000.0f, viewportHeight = 1000.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(918.11f, 594.07f)
                curveTo(869.96f, 719.99f, 755.86f, 808.52f, 627.64f, 842.27f)
                quadTo(524.35f, 869.47f, 417.98f, 852.05f)
                curveTo(281.54f, 829.71f, 153.66f, 747.67f, 93.12f, 620.36f)
                quadTo(61.28f, 553.4f, 59.3f, 480.16f)
                quadTo(57.25f, 404.23f, 87.09f, 334.32f)
                curveTo(140.15f, 210.02f, 257.78f, 125.03f, 387.36f, 95.28f)
                quadTo(388.97f, 94.91f, 387.64f, 95.9f)
                curveTo(335.19f, 134.79f, 306.91f, 199.91f, 314.48f, 265.22f)
                curveTo(320.45f, 316.72f, 347.3f, 363.03f, 388.87f, 393.63f)
                curveTo(429.15f, 423.29f, 479.68f, 435.5f, 529.02f, 427.29f)
                curveTo(589.78f, 417.18f, 640.86f, 378.12f, 667.17f, 322.2f)
                curveTo(682.22f, 290.24f, 687.3f, 253.87f, 682.63f, 219.38f)
                curveTo(675.88f, 169.54f, 649.22f, 124.92f, 608.77f, 94.95f)
                quadTo(607.87f, 94.28f, 608.97f, 94.53f)
                quadTo(704.25f, 115.51f, 782.65f, 172.73f)
                curveTo(842.37f, 216.3f, 889.93f, 275.47f, 916.98f, 344.27f)
                curveTo(948.36f, 424.08f, 948.82f, 513.77f, 918.11f, 594.07f)
                close()
            }
        }
        .build()
        return _darkness!!
    }

private var _darkness: ImageVector? = null
