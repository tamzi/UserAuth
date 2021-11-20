package com.tamzi.userauth.utils

import com.tamzi.userauth.ui.screens.FoodAvailableScreen
import com.tamzi.userauth.ui.screens.LoginScreen
import com.tamzi.userauth.ui.screens.RegistrationScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tamzi.userauth.ui.screens.ForgotPasswordScreen
import com.tamzi.userauth.ui.screens.OnBoardingScreen
import com.tamzi.userauth.ui.screens.SplashScreen

@Composable
fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screen.SplashScreen.route
    ){
        composable(Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(Screen.OnBoardingScreen.route){
            OnBoardingScreen(navController = navController)
        }
        composable(Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(Screen.RegistrationScreen.route){
            RegistrationScreen(navController = navController)
        }
        composable(Screen.ForgotPasswordScreen.route){
            ForgotPasswordScreen(navController = navController)
        }
        composable(Screen.FoodAvailableScreen.route){
            FoodAvailableScreen(navController = navController)
        }
    }

}
