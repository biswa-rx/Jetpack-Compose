package com.example.viewpager_compose.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.viewpager_compose.ui.theme.DarkPink
import com.example.viewpager_compose.ui.theme.LightPink


@Composable
fun CustomToggleButton2(
    selected:Boolean,
    onChangeValue:(Boolean)->Unit
) {
    Card(
        modifier = Modifier.size(50.dp),
        elevation = 0.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(modifier = Modifier
            .background(
                if (selected) DarkPink else LightPink
            )
            .clickable {
                onChangeValue(!selected)
            },
            contentAlignment = if(selected) Alignment.TopEnd else Alignment.TopStart
        ){
            CustomCheck(Modifier.padding(5.dp))
        }
    }
}


@Composable
fun CustomCheck(
    modifier: Modifier
) {

    Card(
        modifier = modifier.size(20.dp),
        elevation = 0.dp,
        shape = CircleShape
    ) {
        Box(modifier = Modifier.background(Color.White))
    }

}