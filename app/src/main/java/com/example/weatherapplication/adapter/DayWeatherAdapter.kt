package com.example.weatherapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.databinding.TodayTemperatureBinding
import com.example.weatherapplication.model.DayWeather

class DayWeatherAdapter(private val dayWeatherList: ArrayList<DayWeather>) :
    RecyclerView.Adapter<DayWeatherAdapter.DayWeatherViewHolder>() {
        private lateinit var binding : TodayTemperatureBinding

        class DayWeatherViewHolder(binding: TodayTemperatureBinding) : RecyclerView.ViewHolder(binding.root){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayWeatherViewHolder {
        binding = TodayTemperatureBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DayWeatherViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dayWeatherList.size
    }

    override fun onBindViewHolder(holder: DayWeatherViewHolder, position: Int) {
        val item = dayWeatherList[position]
        holder.apply {
            binding.ivWeatherIcon.setImageResource(item.icon)
            binding.txtTemperature.text = item.temperature
            binding.txtTime.text = item.time
        }
    }

}