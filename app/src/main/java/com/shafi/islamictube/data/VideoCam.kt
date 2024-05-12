package com.shafi.islamictube.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

val Icons.Filled.Videocam: ImageVector
    get() {
        if (_videocam != null) {
            return _videocam!!
        }
        _videocam = materialIcon(name = "Filled.Videocam") {
            materialPath {
                moveTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        return _videocam!!
    }

private var _videocam: ImageVector? = null