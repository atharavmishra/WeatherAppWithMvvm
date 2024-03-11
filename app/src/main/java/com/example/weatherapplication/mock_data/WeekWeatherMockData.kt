package com.example.weatherapplication.mock_data

import com.example.weatherapplication.R
import com.example.weatherapplication.model.WeeKWeatherData
import com.example.weatherapplication.model.WeekWeather

class WeekWeatherMockData {
    fun weekWeather():WeeKWeatherData{
        val data = arrayListOf(
            WeekWeather(
                day = "Today",
                icon = R.drawable.sun,
                temperature = "15°"
            ),
            WeekWeather(
                day = "Tomorrow",
                temperature = "22°",
                icon = R.drawable.rain
            ), WeekWeather(
                day = "Sun",
                icon = R.drawable.partial_rainy,
                temperature = "25°"
            ), WeekWeather(
                day = "Mon",
                icon = R.drawable.sun,
                temperature = "23°"
            ), WeekWeather(
                day = "Tue",
                icon = R.drawable.rain,
                temperature = "25°"
            ), WeekWeather(
                day = "Thu",
                icon = R.drawable.sun,
                temperature = "27°"
            ), WeekWeather(
                day = "Friday",
                icon = R.drawable.partial_rainy,
                temperature = "30°"
            )
        )
        return WeeKWeatherData(data = data)
    }

}