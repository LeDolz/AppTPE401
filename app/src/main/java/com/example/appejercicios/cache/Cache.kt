package com.example.appejercicios.cache

import android.content.Context


class Cache(val context:Context) {

    companion object{
        private const val STORAGE_NAME = "storage1"
        private const val STORAGE_USERNAME = "username"
    }

    val storage = context.getSharedPreferences(STORAGE_NAME, 0)

    fun setName(name:String){
        storage.edit().putString(STORAGE_USERNAME, name).apply()
    }
    fun getName():String{
        return storage.getString(STORAGE_USERNAME, "")!!
    }



}