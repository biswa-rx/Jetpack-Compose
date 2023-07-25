package com.example.viewpager_compose.sharedviewmodel.viewmodel


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.viewpager_compose.sharedviewmodel.FirstScreen
import com.example.viewpager_compose.sharedviewmodel.SecondScreen
import com.example.viewpager_compose.sharedviewmodel.viewmodel.SharedViewModel


@Composable
fun ScreenNavigation() {

    val navHostController = rememberNavController()
    val viewModel:SharedViewModel = viewModel()

    NavHost(navController = navHostController, startDestination = FIRST_SCREEN ){
        composable(FIRST_SCREEN){
            FirstScreen(navHostController,viewModel)
        }
        composable(SECOND_SCREEN){
            SecondScreen(viewModel)
        }
    }

}
const val  FIRST_SCREEN  = "FIRST_SCREEN"
const val SECOND_SCREEN = "seconf_screen"