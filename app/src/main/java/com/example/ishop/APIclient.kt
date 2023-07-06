package com.example.ishop

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


    object Apiclient{
        var retrofit = Retrofit.Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        fun <T> buildClient(apiInterface: Class<T>): T{
            return retrofit.create(apiInterface)
        }
    }
