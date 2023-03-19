package com.example.retrofit.data.api

import com.example.retrofit.model.Weather.MainModel
import com.example.retrofit.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka>

    @GET("forecast?q=Tambov&appid=2c5cac32b3272b5a7f972d948b9bc0dd")
    suspend fun getBeznalMoneys(
//        @Query("city_name") cityName: String
    ): MainModel
    // Как я могу передовать сюда ссылку? @query и @path
    // suspend потому что сопрограммы?
}

//https://api.openweathermap.org/data/2.5/forecast?q=Tambov&appid=2c5cac32b3272b5a7f972d948b9bc0dd
//https://api.openweathermap.org/data/2.5/С

