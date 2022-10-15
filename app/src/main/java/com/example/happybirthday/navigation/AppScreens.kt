package com.example.happybirthday.navigation

sealed class AppScreens (val route: String){
    object  FirstScreen: AppScreens( route = "firstScreen")
    object SecondScreen: AppScreens( route = "secondScreen")
}