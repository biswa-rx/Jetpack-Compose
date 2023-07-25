package com.example.viewpager_compose.sharedviewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.viewpager_compose.sharedviewmodel.viewmodel.SECOND_SCREEN
import com.example.viewpager_compose.sharedviewmodel.viewmodel.SharedViewModel


@Composable
fun FirstScreen(navHostController: NavHostController,viewModel: SharedViewModel) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Button(onClick = {
            viewModel.setData("Hello how are you?")
            navHostController.navigate(SECOND_SCREEN)
        }) {
            Text(text = "Send Data")
        }
    }

}