package com.example.weatherapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapplication.repository.DayWeatherRepository

@Suppress("UNCHECKED_CAST")
class DayWeatherViewModelFactory(private val dayWeatherRepository: DayWeatherRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DayWeatherViewModel(dayWeatherRepository) as T
    }
}