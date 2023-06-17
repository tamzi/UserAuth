package com.tamzi.userauth.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
    small = RoundedCornerShape(percent = 60),
    medium = RoundedCornerShape(size = 0f),
    large = RoundedCornerShape(
        topStart = 17.dp,
        topEnd = 0.dp,
        bottomEnd = 0.dp,
        bottomStart = 17.dp
    )
)
