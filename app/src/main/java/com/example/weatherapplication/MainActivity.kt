package com.example.weatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapplication.adapter.DayWeatherAdapter
import com.example.weatherapplication.adapter.WeekWeatherAdapter
import com.example.weatherapplication.databinding.ActivityMainBinding
import com.example.weatherapplication.mock_data.DayWeatherMockData
import com.example.weatherapplication.mock_data.WeekWeatherMockData
import com.example.weatherapplication.repository.DayWeatherRepository
import com.example.weatherapplication.repository.WeekWeatherRepository
import com.example.weatherapplication.utils.Resource
import com.example.weatherapplication.viewmodel.DayWeatherViewModel
import com.example.weatherapplication.viewmodel.DayWeatherViewModelFactory
import com.example.weatherapplication.viewmodel.WeekWeatherViewModel
import com.example.weatherapplication.viewmodel.WeekWeatherViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var weekWeatherViewModel: WeekWeatherViewModel
    lateinit var dayWeatherViewModel: DayWeatherViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val weekWeatherRepository = WeekWeatherRepository(WeekWeatherMockData())
        val dayWeatherRepository = DayWeatherRepository(DayWeatherMockData())
        weekWeatherViewModel = ViewModelProvider(this@MainActivity,WeekWeatherViewModelFactory(weekWeatherRepository))[WeekWeatherViewModel::class.java]
        dayWeatherViewModel = ViewModelProvider(this@MainActivity, DayWeatherViewModelFactory(dayWeatherRepository))[DayWeatherViewModel::class.java]
        loadData()
    }

    private fun loadData() {
        setWeekWeather()
        setDayWeatherData()
    }

    private fun setDayWeatherData() {
        dayWeatherViewModel.dayWeather.observe(this@MainActivity){resource->
            when(resource){
                is Resource.Error -> {
                    // print Error
                }
                is Resource.Loading -> {
                    // show loader
                }
                is Resource.Success -> {
                    resource.data?.let {
                        val adapter = DayWeatherAdapter(it.data)
                        binding.rvTodayTemperature.adapter=adapter
                    }


                }
            }
        }
    }

    private fun setWeekWeather() {
        weekWeatherViewModel.weekWeather.observe(this@MainActivity){ resource ->
            when(resource){
                is Resource.Loading -> {}
                is Resource.Error -> resource.data?.let {  }
                is Resource.Success -> resource.data?.let {
                    val adapter = it.data?.let { it1 -> WeekWeatherAdapter(it1) }
                    binding.rvWeekTemperature.adapter = adapter
                }
            }
        }
    }
}