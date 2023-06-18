package com.tamzi.userauthui.utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(percent = 66),
    medium = RoundedCornerShape(size = 0f),
    large = RoundedCornerShape(
        topStart = 17.dp,
        topEnd = 0.dp,
        bottomEnd = 0.dp,
        bottomStart = 17.dp
    )
)