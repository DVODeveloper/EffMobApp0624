package com.example.effmobapp0624.domain.entity.entity_second_screen

import android.widget.ImageView
import com.example.effmobapp0624.domain.entity.Price

data class TicketsOffers(
    val id: Int,
    val title: String,
    val timeRange: List<String>,
    val price: Price,
    val image: ImageView
)
