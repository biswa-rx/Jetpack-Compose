package com.example.viewpager_compose.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ){
        Text("Hello world")
        Text(text = "How are you?", color = Color.Red,
                modifier = Modifier.align(Alignment.TopCenter)
            )
        Button(onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
            Text(text = "Button")
        }
        Text(text = "I am fine",
                modifier = Modifier.align(Alignment.BottomCenter)
                    .padding(bottom = 20.dp)
            )
    }
}