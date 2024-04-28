package com.brian.mvvm__online.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brian.mvvm__online.ui.theme.screens.about.AboutScreen
import com.brian.mvvm__online.ui.theme.screens.home.HomeScreen
import com.brian.mvvm__online.ui.theme.screens.login.LoginScreen
import com.brian.mvvm__online.ui.theme.screens.registration.RegisterScreen
import com.brian.mvvm__online.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController,
        startDestination= startDestination,
        modifier = modifier) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
    }
}
