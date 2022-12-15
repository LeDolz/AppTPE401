package com.example.appejercicios.menu_principal.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appejercicios.R
import com.example.appejercicios.menu_principal.recyclerview.ItemLista

class ItemAdapter(val listaItems:List<ItemLista>, private val clickListener:(ItemLista) -> Unit):RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(layoutInflater.inflate(R.layout.item_menu_principal, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listaItems[position]
        holder.render(item, clickListener)
    }

    override fun getItemCount(): Int {
        return listaItems.size
    }


}