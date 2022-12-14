package com.example.appejercicios.menu_principal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appejercicios.databinding.ActivityMenuPrincipalBinding
import com.example.appejercicios.databinding.ActivityRegisterBinding

class MenuPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityMenuPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}