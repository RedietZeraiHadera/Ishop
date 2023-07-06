package com.example.ishop

data class Product(
    var id:Int,
    var title:String,
    var description:String,
    var price:Double,
    var rating:Double,
    var stock:Int,
    var category:String,
    var thumbnail:String
)
