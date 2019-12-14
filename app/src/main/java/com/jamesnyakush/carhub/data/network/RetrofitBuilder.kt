package com.jamesnyakush.carhub.data.network

import com.jamesnyakush.carhub.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: Api by lazy{
        retrofitBuilder
            .build()
            .create(Api::class.java)
    }
}