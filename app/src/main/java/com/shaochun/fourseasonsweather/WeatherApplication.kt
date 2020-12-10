package com.shaochun.fourseasonsweather

import android.app.Application
import android.content.Context

class WeatherApplication : Application() {
    companion object{
        const val TOKEN = "m2aoWZx8I3Lf9EHT"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}