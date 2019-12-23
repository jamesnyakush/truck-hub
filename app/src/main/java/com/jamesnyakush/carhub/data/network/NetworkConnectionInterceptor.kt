package com.jamesnyakush.carhub.data.network

import android.content.Context
import android.net.ConnectivityManager
import com.jamesnyakush.carhub.util.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

@Suppress("DEPRECATION")
class NetworkConnectionInterceptor(
    context: Context
) : Interceptor {

    private val applicationContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable())
            throw NoInternetException("Make Sure u Have an Active Internet Connection")
        return chain.proceed(chain.request())
    }

    private fun isInternetAvailable(): Boolean {
        val connectivityManager =
            applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        connectivityManager.activeNetworkInfo.also {
            return it != null && it.isConnected
        }
    }
}