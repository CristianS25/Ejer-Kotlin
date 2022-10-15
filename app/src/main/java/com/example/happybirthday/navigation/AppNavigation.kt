package com.example.happybirthday.navigation

import androidx.compose.runtime.Composable
import com.example.happybirthday.screens.FirstScreen
import com.example.happybirthday.screens.SecondScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestinatio = AppScreens.FirstScreen.route
    ){
        composable( route = AppScreens.FirstScreen.route){
            FirstScreen()
        }
        composable( route = AppScreens.SecondScreen.route){
            SecondScreen()
        }
    }
}