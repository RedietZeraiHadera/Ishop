package com.example.ishop

data class ProductsResponse(
    var products: List<Product>,
    var total: Int,
    var skip: Int,
    var limit: Int
)
