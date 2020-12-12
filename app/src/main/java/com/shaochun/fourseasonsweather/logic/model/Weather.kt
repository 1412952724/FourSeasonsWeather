package com.shaochun.fourseasonsweather.logic.model

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/12 14:17
 * @描述:
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)