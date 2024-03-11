package com.example.weatherapplication.model

data class WeeKWeatherData(
    var data: ArrayList<WeekWeather>?
)

data class WeekWeather(
    val day : String,
    val icon : Int,
    val temperature : String
)
