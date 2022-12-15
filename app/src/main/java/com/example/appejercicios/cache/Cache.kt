package com.example.appejercicios.cache

import android.content.Context
import kotlin.math.pow


class Cache(val context:Context) {

    companion object{
        private const val STORAGE_NAME = "storage1"
        private const val STORAGE_USERNAME = "username"
        private const val STORAGE_HEIGHT = "storageheight"
        private const val STORAGE_WEIGHT = "storageweight"
        private const val STORAGE_IMC = "imc"
    }

    val storage = context.getSharedPreferences(STORAGE_NAME, 0)


    fun setAltura(altura:Float){
        storage.edit().putFloat(STORAGE_HEIGHT, altura).apply()
    }
    fun getAltura():Float{
        return storage.getFloat(STORAGE_HEIGHT, 0f)
    }


    fun setPeso(peso:Float){
        storage.edit().putFloat(STORAGE_WEIGHT, peso).apply()
    }
    fun getPeso():Float{
        return storage.getFloat(STORAGE_WEIGHT, 0f)
    }


    fun setName(name:String){
        storage.edit().putString(STORAGE_USERNAME, name).apply()
    }
    fun getName():String?{
        return storage.getString(STORAGE_USERNAME, null)
    }


    fun getImc():Float{
        val altura = getAltura()
        val peso = getPeso()

        val imc = (peso)/(altura.toDouble().pow(2f.toDouble()))

        return imc.toFloat()
    }


}