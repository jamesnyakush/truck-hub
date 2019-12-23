package com.jamesnyakush.carhub.data.network

import com.jamesnyakush.carhub.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {


//    lateinit var networkConnectionInterceptor: NetworkConnectionInterceptor

//    private val okkHttpclient = OkHttpClient.Builder()
//        .addInterceptor(networkConnectionInterceptor)
//        .build()

     val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
//            .client(okkHttpclient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: Api by lazy {
        retrofitBuilder
            .build()
            .create(Api::class.java)
    }
}


