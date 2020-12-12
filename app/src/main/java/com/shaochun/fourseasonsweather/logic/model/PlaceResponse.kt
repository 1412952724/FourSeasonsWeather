package com.shaochun.fourseasonsweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/10 18:19
 * @描述:
 */
data class PlaceResponse(val status:String,val places:List<Place>)
data class Place(val name:String, val location: Location,@SerializedName("formatted_address") val address:String)
data class Location(val lng:String,val lat:String)