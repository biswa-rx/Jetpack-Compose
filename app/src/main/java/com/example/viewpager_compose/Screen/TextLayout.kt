package com.example.viewpager_compose.Screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextLayout() {

    Text(
        text = "Hello dhsfga dsafasdf ls fdsfhsla  fhasdlfhsalhf",
        fontSize = 25.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        letterSpacing = 5.sp,
        lineHeight = 20.sp,
//        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
//        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.LineThrough
    )
}