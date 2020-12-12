package com.shaochun.fourseasonsweather.logic.network

import com.shaochun.fourseasonsweather.WeatherApplication
import com.shaochun.fourseasonsweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/10 18:40
 * @描述:
 */
interface PlaceService {
    /**
     * 搜索地点
     */
    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}