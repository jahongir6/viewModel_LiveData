package com.example.livedata.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedata.models.LiveDataGEtResponse
import com.example.livedata.retrofit.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel : ViewModel() {
    private var liveData = MutableLiveData<ArrayList<LiveDataGEtResponse>>()
    init {
        getAllMoney()
    }
    fun getAllMoney() {
        ApiClient.getRetofitservice().getAllTodo()
            .enqueue(object : Callback<List<LiveDataGEtResponse>> {
                override fun onResponse(
                    call: Call<List<LiveDataGEtResponse>>,
                    response: Response<List<LiveDataGEtResponse>>
                ) {
                    if (response.isSuccessful) {
                        liveData.postValue(response.body() as ArrayList<LiveDataGEtResponse>?)
                    }
                }

                override fun onFailure(call: Call<List<LiveDataGEtResponse>>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
    }

    fun getUserList(): MutableLiveData<ArrayList<LiveDataGEtResponse>> {
        return liveData
    }
}