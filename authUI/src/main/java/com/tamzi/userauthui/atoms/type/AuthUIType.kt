package com.tamzi.userauthui.atoms.type


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tamzi.userauthui.atoms.type.MontserratRegular

// Set of Material typography styles to start with
val SkyTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = MontserratRegular,
        fontWeight = FontWeight.W700,
        fontSize = 16.sp
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)