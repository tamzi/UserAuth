package com.tamzi.userauth.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

/*We set out the various theme colours for our shades of dark and light theme
*
* */


/*Theme 1: IndigoTheme:*/
val indigo = Color(0xFF654D67)
val lightIndigo = Color(0xFF9D5875)
val lighterIndigo = Color(0xFFE5ABB2)
val darkBluish = Color(0xFF312651)

/*Theme 2*/
val white = Color(0xFFFFFFFF)
val cream = Color(0xFFF6EDE2)
val black = Color(0xFF131313)

/*Theme 3: MinimalistTheme*/
val gray = Color(0xFFEFEFEF)
val deepGray = Color(0xFFE6E4E6)
val darkGray = Color( 0xFF83829A)
val lightGray = Color(0xFFF6F6F6)

val bluish = Color(0xFF5944BE)
val lighterBluish = Color(0xFFFF7777CC)

val reddish = Color(0xFFFF4343)
val warmRed = Color(0xFFFF7754)
val limeGreenish = Color(0xFF4ABB00)



/**
 * Return the fully opaque color that results from compositing [onSurface] atop [surface] with the
 * given [alpha]. Useful for situations where semi-transparent colors are undesirable.
 */
@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}

