package com.example.weatherapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapplication.mock_data.DayWeatherMockData
import com.example.weatherapplication.model.DayWeatherData
import com.example.weatherapplication.utils.Resource

class DayWeatherRepository(
    private val dayWeatherMockData: DayWeatherMockData

) {
    private val dayWeatherLiveData = MutableLiveData<Resource<DayWeatherData>>()
    val dayWeather: LiveData<Resource<DayWeatherData>>
        get() = dayWeatherLiveData
    fun getDayWeather() {
        try {
            dayWeatherLiveData.postValue(Resource.Success(data = dayWeatherMockData.dayWeather()))
        }catch (e:Exception){
            dayWeatherLiveData.postValue(Resource.Error(message = e.message.toString()))
        }
    }
}