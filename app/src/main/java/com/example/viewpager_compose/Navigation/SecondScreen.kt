package com.example.viewpager_compose.Navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

data class SecondScreen(private val name : String) : Screen {
    @Composable
    override fun Content() {
            Text(text = "Hey $name")
    }
}