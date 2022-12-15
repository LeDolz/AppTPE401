package com.example.appejercicios.ligas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.appejercicios.R
import com.example.appejercicios.comidas.Comidas
import com.example.appejercicios.databinding.ActivityLigasBinding
import com.example.appejercicios.ejercicios.Ejercicios
import com.example.appejercicios.ligas.adapter.LigasAdapter
import com.example.appejercicios.menu_principal.MenuPrincipal

class Ligas : AppCompatActivity() {

    private lateinit var binding:ActivityLigasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLigasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbarInferior()
        findViewById<TextView>(R.id.tvTituloToolbarSuperior).text = "Ligas"

        Glide.with(applicationContext).load("https://cdn-icons-png.flaticon.com/512/1420/1420338.png").into(binding.ivIconoLigas)
        initRv()

    }

    private fun initRv(){
        val rv = binding.rvLigas
        val manager = LinearLayoutManager(this)
        val decorator = DividerItemDecoration(this, manager.orientation)
        rv.layoutManager = manager
        rv.adapter = LigasAdapter(ProviderLiga.listaUsuarios)
        rv.addItemDecoration(decorator)

    }

    private fun setupToolbarInferior(){

        findViewById<ImageView>(R.id.toolbarIconoCasa).setOnClickListener {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconEjercicio).setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoLigas).setOnClickListener {

        }
        findViewById<ImageView>(R.id.toolbarIconoComida).setOnClickListener {
            startActivity(Intent(this, Comidas::class.java))
        }

    }

}