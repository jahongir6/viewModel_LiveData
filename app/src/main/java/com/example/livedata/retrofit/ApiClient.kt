package com.example.livedata.retrofit

import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    const val BASE_URL = "https://plans1.pythonanywhere.com"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    fun getRetofitservice(): RetrofitService {
        return getRetrofit().create(RetrofitService::class.java)
    }
}