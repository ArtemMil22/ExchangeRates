package com.example.retrofit.data.api

import com.example.retrofit.model.Weather.MainModel
import com.example.retrofit.model.nal.Nalichka
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository : WeatherRepository {

    // Как бы более правильно тут написать? фун или так же переменную

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.privatbank.ua/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    override suspend fun getNal(): Response<Nalichka> {
        return api.getNalMoneys()
    }

    private val retrofit2 by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api2: ApiService by lazy {
        retrofit2.create(ApiService::class.java)
    }

    override suspend fun getBezNal(): MainModel {
        return api2.getBeznalMoneys()
    }
}


//"https://api.weatherapi.com/v1/current.json?key=dd4c99e9128f4741a5483140232901&q=London&aqi=no
//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

//public fun getweather (vv:View){
//    var retro:Retrofit = Retrofit.Builder()
//        .baseUrl("https://api.openweathermap.org/data/2.5")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//    retro.create(ApiService::class.java)


