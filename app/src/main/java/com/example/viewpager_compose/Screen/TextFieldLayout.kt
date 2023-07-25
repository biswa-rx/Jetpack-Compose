package com.example.viewpager_compose.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun TextFieldLayout() {
    var name = remember{
        mutableStateOf("")
    }
    var text = remember { mutableStateOf(TextFieldValue("")) }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
            ) {


//        TextField(
//            value = text,
//            onValueChange = { newText ->
//                text = newText
//            },
//            label = { Text(label) },
//            keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
//        )

    }
}