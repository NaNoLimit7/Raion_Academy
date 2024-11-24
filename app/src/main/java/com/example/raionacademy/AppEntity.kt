package com.example.raionacademy

class AppEntity(
    val id: String,
    val name: String,
    val category: String,
    val rating: Double,
    val imageURL: String,

    )

object AppObject {
    val whatsapp = AppEntity(
        id = "1",
        name = "Whatsapp Messenger",
        category = "Comunication",
        rating = 4.5,
        imageURL = "https://cdn-icons-png.freepik.com/256/15707/15707917.png?semt=ais_hybrid"
    )
    val capcut = AppEntity(
        id = "2",
        name = "CapCut - Video Editor",
        category = "Video Player & Editor",
        rating = 4.0,
        imageURL = "https://static.vecteezy.com/system/resources/previews/013/948/546/non_2x/capcut-logo-on-transparent-white-background-free-vector.jpg",

    )
    val tiktok = AppEntity(
        id = "3",
        name = "TikTok",
        category = "Video Player & Editor",
        rating = 4.6,
        imageURL = "https://cdn4.iconfinder.com/data/icons/social-media-flat-7/64/Social-media_Tiktok-512.png",

    )
    val dana = AppEntity(
        id = "4",
        name = "Dana",
        category = "Comunication",
        rating = 4.5,
        imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQK2_xIL8Re6O9RPNVvvnZZ1fpANOtH-wFCYw&s",

    )
}