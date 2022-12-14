package com.example.appejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appejercicios.cache.AppEjercicios.Companion.cache
import com.example.appejercicios.databinding.ActivityMainBinding
import com.example.appejercicios.login.Register

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup(){

        binding.btnIngresar.setOnClickListener {

            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()

        }

        binding.tvRegistrarse.setOnClickListener {

            startActivity(Intent(this, Register::class.java))

        }


    }


}