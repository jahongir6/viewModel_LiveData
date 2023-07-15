package com.example.livedata.retrofit

import com.example.livedata.models.LiveDataGEtResponse
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("plan")
    fun getAllTodo(): Call<List<LiveDataGEtResponse>>

}