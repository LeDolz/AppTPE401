package com.example.appejercicios.ejercicios.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appejercicios.R
import com.example.appejercicios.ejercicios.Ejercicio

class EjercicioAdapter(val listaEjercicios:List<Ejercicio>) :  RecyclerView.Adapter<EjercicioViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EjercicioViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return EjercicioViewHolder(layoutinflater.inflate(R.layout.item_menu_principal, parent, false))
    }

    override fun onBindViewHolder(holder: EjercicioViewHolder, position: Int) {
        val item = listaEjercicios[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaEjercicios.size
    }


}