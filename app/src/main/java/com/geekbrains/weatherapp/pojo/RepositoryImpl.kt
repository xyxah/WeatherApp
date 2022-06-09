package com.geekbrains.weatherapp.pojo

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }
    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }
}