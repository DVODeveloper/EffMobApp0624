package com.example.effmobapp0624.data.api

import com.example.effmobapp0624.domain.entity.entity_first_screen.ListForFirstScreen
import com.example.effmobapp0624.domain.entity.entity_second_screen.ListForSecondScreen
import com.example.effmobapp0624.domain.entity.entity_third_screen.ListForThirdScreen
import retrofit2.http.GET

interface ApiService {
    @GET("ad9a46ba-276c-4a81-88a6-c068e51cce3a")
    suspend fun getInfoFirstScreen(): ListForFirstScreen

    @GET("38b5205d-1a3d-4c2f-9d77-2f9d1ef01a4a")
    suspend fun getInfoForSecondScreen(): ListForSecondScreen

    @GET("c0464573-5a13-45c9-89f8-717436748b69")
    suspend fun getInfoForThirdScreen(): ListForThirdScreen
}