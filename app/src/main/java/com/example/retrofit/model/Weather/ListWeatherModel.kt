package com.example.retrofit.model.Weather

data class ListWeatherModel(
    val dt: Int,
    val main: Main,
    val weather: List<WeatherX>,
    val clouds: Clouds,
    val wind: Wind,
    val visibility: Int,
    val pop: Double,
    val sys: Sys,
    val dt_txt: String

    //val snow: Snow,
)