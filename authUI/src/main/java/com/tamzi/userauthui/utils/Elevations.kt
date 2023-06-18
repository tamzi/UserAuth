package com.tamzi.userauthui.utils

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Elevation values that can be themed.

@Immutable
data class Elevations(
    val card: Dp = 2.dp,
    val Elevation3: Dp = 3.dp,
)

internal val LocalElevations = staticCompositionLocalOf { Elevations() }