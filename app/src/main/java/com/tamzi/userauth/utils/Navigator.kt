package com.tamzi.userauth.utils

import FoodAvailableScreen
import LoginScreen
import RegistrationScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tamzi.userauth.screens.ForgotPasswordScreen
import com.tamzi.userauth.screens.OnBoardingScreen
import com.tamzi.userauth.screens.SplashScreen

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
