package com.jnyakush.carhub.network.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//    const val BASE_URL: String = "http://192.168.43.201/truckhub/public/api/v1/"
//    const val BASE_URL: String = "https://truck-hub-271612.appspot.com/api/v1/"
const val BASE_URL: String = "http://192.168.56.1/truckhub/public/api/v1/"

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