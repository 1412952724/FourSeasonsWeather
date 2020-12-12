package com.shaochun.fourseasonsweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/12 14:09
 * @描述:
 */
class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}