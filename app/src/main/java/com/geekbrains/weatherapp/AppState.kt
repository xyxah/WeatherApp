package com.geekbrains.weatherapp

import com.geekbrains.weatherapp.pojo.Weather

sealed class AppState {
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}