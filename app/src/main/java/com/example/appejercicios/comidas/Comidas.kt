package com.example.appejercicios.comidas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.appejercicios.R
import com.example.appejercicios.databinding.ActivityComidasBinding
import com.example.appejercicios.ejercicios.Ejercicios
import com.example.appejercicios.ligas.Ligas
import com.example.appejercicios.menu_principal.MenuPrincipal

class Comidas : AppCompatActivity() {

    private lateinit var binding:ActivityComidasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbarInferior()
        findViewById<TextView>(R.id.tvTituloToolbarSuperior).text = "Recetas Saludables"

    }

    private fun setupToolbarInferior(){

        findViewById<ImageView>(R.id.toolbarIconoCasa).setOnClickListener {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconEjercicio).setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoLigas).setOnClickListener {
            startActivity(Intent(this, Ligas::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoComida).setOnClickListener {

        }

    }
}