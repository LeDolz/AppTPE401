package com.example.appejercicios.cache

import android.app.Application

class AppEjercicios: Application() {

    companion object{
        lateinit var cache:Cache
    }

    override fun onCreate() {
        super.onCreate()
        cache = Cache(applicationContext)
    }

}