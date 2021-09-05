package com.tamzi.userauth.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.tamzi.userauth.R


private val Gilroy = FontFamily(
    Font(R.font.gilroy_light)
)

private val DMSans = FontFamily(
    Font(R.font.dmsans_bold),
    Font(R.font.dmsans_medium),
    Font(R.font.dmsans_regular),
)

val AuthTypography = Typography(
    h1 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h2 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h3 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h4 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    h5 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    h6 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    subtitle1 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.W500,
        lineHeight = 22.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.W500
    ),
    body1 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 16.sp
    ),
    button = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,

    ),


)