package com.shaochun.fourseasonsweather

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

/**
 * @创建者: w_shaochun
 * @时间: 2020/12/11 17:50
 * @描述:
 */
object SPUtils {
    inline fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit){
        val editor = edit()
        editor.block()
        editor.apply()
    }

    inline fun <reified T> startActivity(context: Context){
        val intent = Intent(context, T::class.java)
        context.startActivity(intent)
    }
    inline fun <reified T> startActivity(context: Context,block:Intent.() -> Unit){
        val intent = Intent(context, T::class.java)
        intent.block()
        context.startActivity(intent)
    }
}
