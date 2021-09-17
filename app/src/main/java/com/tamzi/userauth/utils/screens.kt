package com.tamzi.userauth.utils

sealed class Screen(val route: String) {
    object SplashSCreen : Screen("splash_screen")
    object OnBoardingScreen: Screen("splash_screen")

}
