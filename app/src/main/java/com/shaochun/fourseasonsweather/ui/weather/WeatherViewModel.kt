package com.shaochun.fourseasonsweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.shaochun.fourseasonsweather.logic.Repository
import com.shaochun.fourseasonsweather.logic.model.Location

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/12 14:50
 * @描述:
 */
class WeatherViewModel : ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }
}