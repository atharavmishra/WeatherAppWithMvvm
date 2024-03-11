package com.example.weatherapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.model.WeeKWeatherData
import com.example.weatherapplication.repository.WeekWeatherRepository
import com.example.weatherapplication.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class  WeekWeatherViewModel(
    private val weekWeatherRepository: WeekWeatherRepository
) : ViewModel() {


    init {
        viewModelScope.launch {
            weekWeatherRepository.getWeekWeather()
        }
    }
    val weekWeather : LiveData<Resource<WeeKWeatherData>>
        get() = weekWeatherRepository.weekWeather
}