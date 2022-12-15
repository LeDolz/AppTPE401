package com.example.appejercicios.menu_principal.recyclerview

data class ItemLista(

    val titulo: String,
    val descripcion: String,
    val img: String

)

class ItemProvider{

    companion object{

        val listaDeItems = listOf<ItemLista>(
            ItemLista(
                "Ejercicios de brazos",
                "Simples ejercicios con los brazos",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cropped-image-of-unrecognisable-man-working-out-royalty-free-image-1640868217.jpg"
            ),
            ItemLista(
                "Comidas saludables",
                "Colección de recetas para comidas saludables",
                "https://www.comedera.com/wp-content/uploads/2021/12/ensalada-de-lechuga1.jpg"
            ),
        )

    }

}