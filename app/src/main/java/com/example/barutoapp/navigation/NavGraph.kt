package com.example.barutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.barutoapp.presentation.screens.home.HomeScreen
import com.example.barutoapp.presentation.screens.splash.SplashScreen
import com.example.barutoapp.presentation.screens.welcome.WelcomeScreen
import com.example.barutoapp.util.Constants.DETAILS_ARGUMENTS_KEY
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ){
        composable(route = Screen.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument( DETAILS_ARGUMENTS_KEY) {
                type = NavType.IntType
            })
        ){

        }
        composable(route = Screen.Search.route){

        }


    }

}