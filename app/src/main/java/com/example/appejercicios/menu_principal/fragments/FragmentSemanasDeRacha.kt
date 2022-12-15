package com.example.appejercicios.menu_principal.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appejercicios.R
import com.example.appejercicios.databinding.FragmentSemanasDeRachaBinding




class FragmentSemanasDeRacha : Fragment() {

    private var _binding:FragmentSemanasDeRachaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSemanasDeRachaBinding.inflate(inflater, container, false)



        return binding.root
    }


}