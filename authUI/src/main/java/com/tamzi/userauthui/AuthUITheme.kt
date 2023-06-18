package com.tamzi.userauthui

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.tamzi.sky.atoms.type.SkyTypography
import com.tamzi.userauthui.atoms.color.amber
import com.tamzi.userauthui.atoms.color.black
import com.tamzi.userauthui.atoms.color.blue
import com.tamzi.userauthui.atoms.color.indigo
import com.tamzi.userauthui.atoms.color.warmishGreen
import com.tamzi.userauthui.atoms.color.white

val DarkColorPalette = darkColorScheme(
    primary = amber,
    secondary = blue,
    background = black,
)

val LightColorPalette = lightColorScheme(
    primary = indigo,
    secondary = warmishGreen,
    background = white,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)


@Composable
fun SkyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorPallete = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorPalette
        else -> LightColorPalette
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorPallete.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorPallete,
        typography = SkyTypography,
        content = content
    )
}