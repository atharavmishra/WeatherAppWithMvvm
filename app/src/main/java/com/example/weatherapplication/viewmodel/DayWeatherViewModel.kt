package com.example.weatherapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.model.DayWeatherData
import com.example.weatherapplication.model.WeeKWeatherData
import com.example.weatherapplication.repository.DayWeatherRepository
import com.example.weatherapplication.utils.Resource
import kotlinx.coroutines.launch

class DayWeatherViewModel(private val dayWeatherRepository: DayWeatherRepository)  : ViewModel(){

    init {
            viewModelScope.launch {
                dayWeatherRepository.getDayWeather()
            }
    }
    val dayWeather : LiveData<Resource<DayWeatherData>>
        get() = dayWeatherRepository.dayWeather
}