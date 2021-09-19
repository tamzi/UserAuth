package com.tamzi.userauth.utils

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object OnBoardingScreen: Screen("splash_screen")
    object LoginScreen: Screen("splash_screen")
    object ForgotPasswordScreen: Screen("splash_screen")
    object RegistrationScreen: Screen("splash_screen")
    object FoodAvailableScreen: Screen("splash_screen")

}
