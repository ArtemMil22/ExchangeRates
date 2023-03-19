package com.example.retrofit.model.Weather

data class MainModel(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<ListWeatherModel>,
    val message: Int
)