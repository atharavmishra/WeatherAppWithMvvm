package com.example.weatherapplication.mock_data

import com.example.weatherapplication.R
import com.example.weatherapplication.model.DayWeather
import com.example.weatherapplication.model.DayWeatherData

class DayWeatherMockData {
    fun dayWeather():DayWeatherData{
        val data =  arrayListOf(
            DayWeather(
                time = "Now",
                icon = R.drawable.cloudy,
                temperature = "17°"
            ),
            DayWeather(
                time = "1:00 PM",
                icon = R.drawable.sun,
                temperature = "22°"
            ),
            DayWeather(
                time = "2:00 PM",
                icon = R.drawable.partial_rainy,
                temperature = "25°"
            ),
            DayWeather(
                time = "3:00 PM",
                icon = R.drawable.rain,
                temperature = "20°"
            ),
            DayWeather(
                time = "4:00 PM",
                icon = R.drawable.rain,
                temperature = "18°"
            ),
            DayWeather(
                time = "5:00 PM",
                icon = R.drawable.rain,
                temperature = "18°"
            ),
            DayWeather(
                time = "6:00 PM",
                icon = R.drawable.partial_rainy,
                temperature = "20°"
            ),
            DayWeather(
                time = "7:00 PM",
                icon = R.drawable.moon,
                temperature = "15°"
            ),
            DayWeather(
                time = "8:00 PM",
                icon = R.drawable.moon,
                temperature = "14°"
            ),
            DayWeather(
                time = "9:00 PM",
                icon = R.drawable.moon,
                temperature = "15°"
            ),
        )
        return DayWeatherData(data = data)

    }
}