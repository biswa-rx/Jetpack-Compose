package com.example.viewpager_compose.ViewPager

import androidx.annotation.DrawableRes
import com.example.viewpager_compose.R

data class DataSource (
    @DrawableRes val image:Int,
    val des:String
        )

val dataList = listOf<DataSource>(
    DataSource(R.drawable.page_one,"PAGE ONE"),
    DataSource(R.drawable.page_two,"PAGE TWO"),
    DataSource(R.drawable.page_three,"PAGE THREE")
)