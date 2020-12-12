package com.shaochun.fourseasonsweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.shaochun.fourseasonsweather.WeatherApplication
import com.shaochun.fourseasonsweather.logic.model.Place

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/12 17:23
 * @描述:
 */
object PlaceDao {

    fun savePlace(place:Place){
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }
    fun getSavedPlace():Place{
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }
    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = WeatherApplication.context.getSharedPreferences("weather",
        Context.MODE_PRIVATE)
}