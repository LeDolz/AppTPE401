package com.example.appejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appejercicios.cache.AppEjercicios.Companion.cache
import com.example.appejercicios.databinding.ActivityMainBinding
import com.example.appejercicios.login.Register
import com.example.appejercicios.menu_principal.MenuPrincipal
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup(){

        binding.btnIngresar.setOnClickListener {

            login()

        }

        binding.tvRegistrarse.setOnClickListener {

            startActivity(Intent(this, Register::class.java))

        }


    }

    private fun login() {

        if(binding.etEmailLogin.text.isNotEmpty() && binding.etPasswordLogin.text.isNotEmpty()){

            FirebaseAuth.getInstance().signInWithEmailAndPassword(
                binding.etEmailLogin.text.toString(),
                binding.etPasswordLogin.text.toString()
            ).addOnCompleteListener{
                if(it.isSuccessful){
                    startActivity(Intent(this, MenuPrincipal::class.java))
                    Toast.makeText(this, "Bienvenido!", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Los datos son incorrectos", Toast.LENGTH_SHORT).show()
                }
            }

        }
        else{
            Toast.makeText(this, "Alguno de los datos se encuentra vacío", Toast.LENGTH_SHORT).show()
        }

    }


}