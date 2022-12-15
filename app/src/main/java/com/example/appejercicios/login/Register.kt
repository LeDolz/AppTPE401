package com.example.appejercicios.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appejercicios.cache.AppEjercicios.Companion.cache
import com.example.appejercicios.databinding.ActivityRegisterBinding
import com.example.appejercicios.menu_principal.MenuPrincipal
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    private lateinit var binding:ActivityRegisterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup() {

        binding.btnRegistrarse.setOnClickListener {

            //todo validar datos

            if(
                binding.etEmailRegister.text.isNotEmpty() &&
                binding.etPasswordRegister.text.isNotEmpty() &&
                binding.etUsernameRegister.text.isNotEmpty() &&
                binding.etPesoRegister.text.isNotEmpty() &&
                binding.etAlturaRegister.text.isNotEmpty()
            ){

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    binding.etEmailRegister.text.toString(),
                    binding.etPasswordRegister.text.toString()
                ).addOnCompleteListener{
                    if(it.isSuccessful){

                        cache.setAltura(binding.etAlturaRegister.text.toString().toFloat())
                        cache.setPeso(binding.etPesoRegister.text.toString().toFloat())
                        cache.setName(binding.etUsernameRegister.text.toString())

                        Toast.makeText(this, "Cuenta creada con éxito", Toast.LENGTH_SHORT).show()

                        startActivity(Intent(this, MenuPrincipal::class.java))

                    }
                    else{
                        Toast.makeText(this, "Ha ocurrido un error al crear la cuenta.", Toast.LENGTH_SHORT).show()
                    }
                }

            }else{

                Toast.makeText(this, "Alguno de los datos no se encuentra completo.", Toast.LENGTH_SHORT).show()

            }

        }

    }
}