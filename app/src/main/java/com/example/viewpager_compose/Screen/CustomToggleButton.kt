package com.example.viewpager_compose.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viewpager_compose.R


@Composable
fun CustomToggleButton(){
    var isToggle by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(50.dp) // Set the height of the Box
            .clickable { isToggle = !isToggle }
    ) {
        Card(
            shape = RoundedCornerShape(39.dp),
            elevation = CardDefaults.cardElevation(0.dp),
            modifier = Modifier
                .fillMaxSize()
                .clickable { isToggle = !isToggle }
        ) {
            Box(
                modifier = Modifier.background(
                    if (isToggle) Color.Green else Color.Black
                ).fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                if (isToggle) {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Text(
                            text = "On", style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W400
                            ), color = Color.White, modifier = Modifier.padding(start = 10.dp)
                                .align(CenterVertically)
                        )
                        Icon(
                            painterResource(id = R.drawable.ic_on), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(10.dp)
                        )
                    }
                } else {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Icon(
                            painterResource(id = R.drawable.ic_off), contentDescription = "",
                            tint = Color.Unspecified
                        )
                        Text(
                            text = "Off",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W400
                            ),
                            color = Color.White,
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                                .align(CenterVertically)
                        )
                    }
                }
            }

        }
    }
}