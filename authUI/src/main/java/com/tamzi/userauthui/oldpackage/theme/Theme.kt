/*
import UserAuthTheme.typography
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp
import com.tamzi.userauth.ui.theme.*
import com.tamzi.userauthui.oldpackage.theme.utils.Elevations
import com.tamzi.userauthui.oldpackage.theme.utils.LocalElevations

private val IndigoThemeLight = lightColors(
    primary = indigo,
    primaryVariant = lightIndigo,
    onPrimary = black,
    secondary = lighterIndigo,
    secondaryVariant = darkBluish,
    onSecondary = white,
)
private val IndigoThemeDark = lightColors(
    primary = gray,
    secondary = cream,
    onSecondary = white,
    surface = darkGray,
)



@Composable
fun IndigoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        IndigoThemeDark
    } else {
        IndigoThemeLight
    }
    UserAuthTheme(darkTheme, colors, content)
}

private val LightElevation = Elevations ()

private val DarkElevation = Elevations (card = 2.dp)




*/
/*
    UserAuthTheme:
    This is a custom theme but is extended from material design.

    It consists of indigo dark and light
 *//*


@Composable
private fun UserAuthTheme(
    darkTheme: Boolean,
    colors: Colors,
    content: @Composable () -> Unit
) {
    val elevation = if (darkTheme) DarkElevation else LightElevation
    CompositionLocalProvider(
        LocalElevations provides elevation,
    ) {
        MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
        )

    }

}



object UserAuthTheme {

    val colors: Colors
        @Composable
        get() = MaterialTheme.colors


    val typography: Typography
        @Composable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val elevations: Elevations
        @Composable
        get() = LocalElevations.current


}
*/
