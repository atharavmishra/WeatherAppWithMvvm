package com.example.weatherapplication.model
data class DayWeatherData(
    val data: ArrayList<DayWeather>
)
data class DayWeather(
    val time : String,
    val icon : Int,
    val temperature : String
)
