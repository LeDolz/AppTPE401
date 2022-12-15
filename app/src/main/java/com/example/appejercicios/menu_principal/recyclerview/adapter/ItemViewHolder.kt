package com.example.appejercicios.menu_principal.recyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appejercicios.databinding.ItemMenuPrincipalBinding
import com.example.appejercicios.menu_principal.recyclerview.ItemLista

class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemMenuPrincipalBinding.bind(view)

    val titulo = binding.tvTituloRvListaMenu
    val img = binding.ivImagenRvListaMenu

    fun render(item:ItemLista, clickListener:(ItemLista) -> Unit){

        titulo.text = item.titulo
        Glide.with(img).load(item.img).into(img)

        itemView.setOnClickListener {
            clickListener(item)
        }

    }

}