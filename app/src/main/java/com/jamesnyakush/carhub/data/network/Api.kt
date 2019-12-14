package com.jamesnyakush.carhub.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("buyairtimewallet.php")
    fun airtimeSelfWallet(
        @Field("phone") phone: Int,
        @Field("amount") amount: Int
    ): Call<ResponseBody>
}