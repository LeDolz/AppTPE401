package com.example.appejercicios.ejercicios

data class Ejercicio(

    val titulo: String,
    val img: String
)

class ProviderEjercicios{

    companion object{

        val listaEjercicios = listOf<Ejercicio>(
            Ejercicio(
                "Flexiones",
                "https://tumejorfisico.com/wp-content/uploads/2020/10/flexiones.jpg"
            ),
            Ejercicio(
                "Saltos de estrella",
                "https://elements-video-cover-images-0.imgix.net/files/370a5797-3117-42b5-b126-949d28542ce5/inline_image_preview.jpg?auto=compress%2Cformat&fit=min&h=281&w=500&s=d313846eadf709d4403f7538b5f60ac2"
            ),
            Ejercicio(
                "Sentadillas",
                "https://www.sabervivirtv.com/medio/2022/02/14/la-guia-para-hacer-bien-las-sentadillas_582d5b3f_1280x720.jpg"
            ),
            Ejercicio(
                "Burpees",
                "https://ejerciciosencasa.es/wp-content/uploads/2013/09/Burpee.jpg"
            ),
            Ejercicio(
                "Abdominales",
                "https://www.sabervivirtv.com/medio/2018/06/26/1_84b50bc8_1200x710.jpg"
            ),
        )

    }

}