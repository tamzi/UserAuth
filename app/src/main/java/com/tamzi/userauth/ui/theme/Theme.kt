import android.app.assist.AssistContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.lightColors
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import com.tamzi.userauth.ui.theme.*

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

