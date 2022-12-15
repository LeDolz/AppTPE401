package com.example.appejercicios.ligas

data class UsuarioLiga(

    val username:String,
    val imagenPerfil:String,
    val rango:String

)

class ProviderLiga{

    companion object{
        val listaUsuarios = listOf<UsuarioLiga>(
            UsuarioLiga(
                "manuel124",
            "https://static.nationalgeographic.es/files/styles/image_3200/public/75552.ngsversion.1422285553360.jpg?w=1600&h=1067",
                "1"
            ),
            UsuarioLiga(
                "maria5643",
                "https://www.elmueble.com/medio/2022/09/05/perro-cachorro_82dd9cd3_900x900.jpg",
                "2"
            ),
            UsuarioLiga(
                "hector_",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoG2AlDvFvIOyhx7PM2fL4m2jtQfVW_ju2_A&usqp=CAU",
                "3"
            ),
            UsuarioLiga(
                "sasdsda123",
                "data:image/jpeg;base64,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",
                "4"
            ),
            UsuarioLiga(
                "mesa999",
                "https://i.pinimg.com/550x/53/07/c4/5307c4b56178f0d0fb84ae3ef0780f93.jpg",
                "5"
            ),
        )
    }

}

