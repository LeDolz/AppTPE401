package com.example.appejercicios.ejercicios.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appejercicios.databinding.ItemMenuPrincipalBinding
import com.example.appejercicios.ejercicios.Ejercicio
import com.example.appejercicios.menu_principal.recyclerview.ItemLista

class EjercicioViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding = ItemMenuPrincipalBinding.bind(view)

    val titulo = binding.tvTituloRvListaMenu
    val img = binding.ivImagenRvListaMenu

    fun render(item: Ejercicio){

        titulo.text = item.titulo
        Glide.with(img.context).load(item.img).into(img)

    }

}