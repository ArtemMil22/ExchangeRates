package com.example.retrofit.data.api

import com.example.retrofit.model.Weather.MainModel
import com.example.retrofit.model.nal.Nalichka
import retrofit2.Response

interface WeatherRepository {
    suspend fun getNal(): Response<Nalichka>
    suspend fun getBezNal(): MainModel
}