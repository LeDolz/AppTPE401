package com.example.appejercicios.ligas.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appejercicios.databinding.ItemLigaBinding
import com.example.appejercicios.databinding.ItemMenuPrincipalBinding
import com.example.appejercicios.ligas.UsuarioLiga

class LigasViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding = ItemLigaBinding.bind(view)

    val tituloUsername = binding.tvNombreLigas
    val rango = binding.tvNumeroLigas
    val imagen = binding.ivItemLiga


    fun render(usuarios: UsuarioLiga){

        tituloUsername.text = usuarios.username
        rango.text = usuarios.rango
        Glide.with(imagen.context).load(usuarios.imagenPerfil).into(imagen)

    }

}