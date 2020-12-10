package com.shaochun.fourseasonsweather.logic

import androidx.lifecycle.liveData
import com.shaochun.fourseasonsweather.logic.model.Place
import com.shaochun.fourseasonsweather.logic.network.WeatherNetWork
import kotlinx.coroutines.Dispatchers

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/10 18:58
 * @描述:
 */
object Repository {
    fun searchPlaces(query:String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = WeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}