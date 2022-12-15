package com.example.appejercicios.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appejercicios.R
import com.example.appejercicios.comidas.Comidas
import com.example.appejercicios.databinding.ActivityEjerciciosBinding
import com.example.appejercicios.ejercicios.adapter.EjercicioAdapter
import com.example.appejercicios.ligas.Ligas
import com.example.appejercicios.menu_principal.MenuPrincipal
import com.example.appejercicios.menu_principal.recyclerview.ItemProvider
import com.example.appejercicios.menu_principal.recyclerview.adapter.ItemAdapter

class Ejercicios : AppCompatActivity() {

    private lateinit var binding:ActivityEjerciciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjerciciosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbarInferior()
        findViewById<TextView>(R.id.tvTituloToolbarSuperior).text = "Ejercicios"

        initRv()

    }

    private fun initRv(){
        val layoutManager = LinearLayoutManager(this)
        val rv = binding.rvEjercicios
        val decorator = DividerItemDecoration(this, layoutManager.orientation)
        rv.layoutManager = layoutManager
        rv.adapter = EjercicioAdapter(ProviderEjercicios.listaEjercicios)
        rv.addItemDecoration(decorator)
    }

    private fun setupToolbarInferior(){

        findViewById<ImageView>(R.id.toolbarIconoCasa).setOnClickListener {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconEjercicio).setOnClickListener {

        }
        findViewById<ImageView>(R.id.toolbarIconoLigas).setOnClickListener {
            startActivity(Intent(this, Ligas::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoComida).setOnClickListener {
            startActivity(Intent(this, Comidas::class.java))
        }

    }

}