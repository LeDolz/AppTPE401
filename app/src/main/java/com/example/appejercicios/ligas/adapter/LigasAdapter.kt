package com.example.appejercicios.ligas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appejercicios.R
import com.example.appejercicios.ligas.UsuarioLiga

class LigasAdapter(val listaLigas:List<UsuarioLiga>):RecyclerView.Adapter<LigasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LigasViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return LigasViewHolder(layoutinflater.inflate(R.layout.item_liga, parent, false))
    }

    override fun onBindViewHolder(holder: LigasViewHolder, position: Int) {
        val item = listaLigas[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaLigas.size
    }
}