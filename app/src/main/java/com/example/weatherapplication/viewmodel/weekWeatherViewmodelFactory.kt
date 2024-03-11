package com.example.weatherapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapplication.repository.DayWeatherRepository
import com.example.weatherapplication.repository.WeekWeatherRepository

@Suppress("UNCHECKED_CAST")
class WeekWeatherViewModelFactory(private val weekWeatherRepository: WeekWeatherRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WeekWeatherViewModel(weekWeatherRepository) as T
    }
}