package com.example.appejercicios.menu_principal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appejercicios.R
import com.example.appejercicios.cache.AppEjercicios.Companion.cache
import com.example.appejercicios.comidas.Comidas
import com.example.appejercicios.databinding.ActivityMenuPrincipalBinding
import com.example.appejercicios.databinding.ActivityRegisterBinding
import com.example.appejercicios.ejercicios.Ejercicios
import com.example.appejercicios.ligas.Ligas
import com.example.appejercicios.menu_principal.recyclerview.ItemLista
import com.example.appejercicios.menu_principal.recyclerview.ItemProvider
import com.example.appejercicios.menu_principal.recyclerview.adapter.ItemAdapter

class MenuPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityMenuPrincipalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbarInferior()
        initRv()
        findViewById<TextView>(R.id.tvTituloToolbarSuperior).text = "Menú principal"


        val tvValorImc = binding.tvImcValueToolbar


        tvValorImc.text = (Math.round(cache.getImc() * 100.0) / 100.0).toString()

        when(tvValorImc.text.toString().toDouble()){

            in 0.0..18.4 -> colorImc(0, tvValorImc)
            in 18.5..24.9 -> colorImc(1, tvValorImc)
            in 25.0..29.9 -> colorImc(2, tvValorImc)
            in 30.0..34.9 -> colorImc(3, tvValorImc)
            in 35.0..35.9 -> colorImc(4, tvValorImc)
            in 40.0..90.0 -> colorImc(5, tvValorImc)

        }


    }

    private fun initRv() {
        val layoutManager = LinearLayoutManager(this)
        val rv = binding.rvMenuPrincipal
        val decorator = DividerItemDecoration(this, layoutManager.orientation)
        rv.layoutManager = layoutManager
        rv.adapter = ItemAdapter(ItemProvider.listaDeItems) { onItemSelected(it) }
        rv.addItemDecoration(decorator)


    }

    private fun onItemSelected(item:ItemLista){
        if(item.titulo == "Ejercicios de brazos"){
            startActivity(Intent(this, Ejercicios::class.java))
        }
        if(item.titulo == "Comidas saludables"){
            startActivity(Intent(this, Comidas::class.java))
        }
    }

    private fun setupToolbarInferior(){

        findViewById<ImageView>(R.id.toolbarIconoCasa).setOnClickListener {

        }
        findViewById<ImageView>(R.id.toolbarIconEjercicio).setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoLigas).setOnClickListener {
            startActivity(Intent(this, Ligas::class.java))
        }
        findViewById<ImageView>(R.id.toolbarIconoComida).setOnClickListener {
            startActivity(Intent(this, Comidas::class.java))
        }

    }

    private fun colorImc(gradoImc:Int, tv:TextView){

        var color = 0

        when(gradoImc){

            0 -> color = resources.getColor(R.color.color_peso_bajo) //, resources.newTheme()
            1 -> color = resources.getColor(R.color.color_peso_normal)
            2 -> color = resources.getColor(R.color.color_sobrepeso)
            3-> color = resources.getColor(R.color.color_obesidad1)
            4 -> color = resources.getColor(R.color.color_obesidad2)
            5 -> color = resources.getColor(R.color.color_obesidad3)

        }

        tv.setTextColor(color)

    }

}