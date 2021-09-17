package com.example.mvvmkotlin.retrofit

import com.example.mvvmkotlin.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("services")
    fun getServices() : Call<ServicesSetterGetter>

}