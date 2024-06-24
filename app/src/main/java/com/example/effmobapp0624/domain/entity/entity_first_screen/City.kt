package com.example.effmobapp0624.domain.entity.entity_first_screen

import android.widget.ImageView
import com.example.effmobapp0624.domain.entity.Price


data class City(
    val id: Int,
    val title: String,
    val town: String,
    val price: Price,
    val image: ImageView
)



