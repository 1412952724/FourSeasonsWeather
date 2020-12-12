package com.shaochun.fourseasonsweather.logic.network

import com.shaochun.fourseasonsweather.WeatherApplication
import com.shaochun.fourseasonsweather.logic.model.DailyResponse
import com.shaochun.fourseasonsweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/12 14:29
 * @描述:
 */
interface WeatherService {
    /**
     * 获取实时天气信息
     */
    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng")lng:String, @Path("lat")lat:String): Call<RealtimeResponse>
    /**
     * 获取未来天气信息
     */
    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}