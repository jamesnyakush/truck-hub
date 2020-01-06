package com.jamesnyakush.carhub.data.network

import com.jamesnyakush.carhub.data.db.entity.Truck
import com.jamesnyakush.carhub.data.network.response.AuthResponse
import com.jamesnyakush.carhub.data.network.response.TruckResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Response<AuthResponse>

    @FormUrlEncoded
    @POST("auth/signup")
    suspend fun userSignup(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Response<AuthResponse>

    @GET("trucks")
    suspend fun getTrucks(): Response<TruckResponse>


}