package com.example.weatherapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapplication.mock_data.WeekWeatherMockData
import com.example.weatherapplication.model.WeeKWeatherData
import com.example.weatherapplication.utils.Resource

class WeekWeatherRepository(
    private val weekWeatherMockData: WeekWeatherMockData
)  {
    private val weekWeatherLiveData = MutableLiveData<Resource<WeeKWeatherData>>()
    val weekWeather:LiveData<Resource<WeeKWeatherData>>
        get() = weekWeatherLiveData
    suspend fun getWeekWeather() {
        try {
            weekWeatherLiveData.postValue(Resource.Success(data = weekWeatherMockData.weekWeather()))
        }catch (e:Exception){
            weekWeatherLiveData.postValue(Resource.Error(message = e.message.toString()))
        }
    }
}