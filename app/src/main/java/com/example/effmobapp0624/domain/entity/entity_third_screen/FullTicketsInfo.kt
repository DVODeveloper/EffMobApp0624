package com.example.effmobapp0624.domain.entity.entity_third_screen

import com.example.effmobapp0624.domain.entity.Price

data class FullTicketsInfo(
    val id: Int,
    val badge: String,
    val price: Price,
    val provider_name: String,
    val company: String,
    val departure: Departure,
    val arrival: Arrival,
    val has_transfer: Boolean = false,
    val has_visa_transfer: Boolean = false,
    val luggage: Luggage,
    val hand_luggage: Hand_luggage,
    val is_returnable: Boolean = false,
    val is_exchangable: Boolean = true

)

data class Departure(
    val town: String,
    val date: String,
    val airport: String
)

data class Arrival(
    val town: String,
    val date: String,
    val airport: String
)

data class Luggage(
    val has_luggage: Boolean = false,
    val price: Price
)

data class Hand_luggage(
    val has_hand_luggage: Boolean = true,
    val size: String
)
