package com.example.ishop

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/product")
    fun getProducts(): Call<ProductsResponse>
}