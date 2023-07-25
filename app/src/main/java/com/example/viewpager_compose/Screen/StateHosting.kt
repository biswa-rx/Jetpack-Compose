package com.example.viewpager_compose.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
// or just
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StateHosting() {
    ParentContent()
}

@Composable
fun ParentContent() {
    var name by remember { mutableStateOf("") }
    ChildContent(name = name){
        name = it
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChildContent(name: String, onChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "hello $name")
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = name, onValueChange =  {
            onChange(it)
        },
            placeholder = {Text(text = "Type something...")}
        )

    }
}
