package com.example.viewpager_compose.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun ButtonLayout() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

        ) {
        Button(onClick = {},
            elevation = ButtonDefaults.buttonElevation(
                pressedElevation = 10.dp,
                hoveredElevation = 4.dp
            ),
            shape = CutCornerShape(10.dp), //RoundedCornerShape,Rectangle etc.
            border = BorderStroke(2.dp, color = Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Yellow
            )
        ){
            Text(text = "Simple Button")
        }

        TextButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color.Yellow
            )
            ) {
            Text(text = "Text Button")

        }
        
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Outlined Button")
        }

    }
}