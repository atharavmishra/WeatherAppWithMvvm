package com.example.weatherapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.databinding.WeekTemperatureRvBinding
import com.example.weatherapplication.model.WeekWeather

class WeekWeatherAdapter(private val weekWeatherList: ArrayList<WeekWeather>) :
    RecyclerView.Adapter<WeekWeatherAdapter.WeekWeatherViewHolder>() {
        private lateinit var binding: WeekTemperatureRvBinding
    class WeekWeatherViewHolder(binding: WeekTemperatureRvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekWeatherViewHolder {
        binding = WeekTemperatureRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WeekWeatherViewHolder(binding)
    }

    override fun getItemCount(): Int = weekWeatherList.size

    override fun onBindViewHolder(holder: WeekWeatherViewHolder, position: Int) {
        val weekWeather = weekWeatherList[position]
        holder.apply {
            binding.txtDayName.text = weekWeather.day
            binding.ivWeatherIcon.setImageResource(weekWeather.icon)
            binding.txtTemperature.text = weekWeather.temperature
        }
    }
}