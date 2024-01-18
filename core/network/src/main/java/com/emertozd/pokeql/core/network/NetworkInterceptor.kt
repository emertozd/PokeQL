package com.emertozd.pokeql.core.network

import android.content.Context
import com.emertozd.pokeql.core.network.exception.NetworkUnavailableException
import com.emertozd.pokeql.core.network.extension.isNetworkAvailable
import okhttp3.Interceptor
import okhttp3.Response

class NetworkInterceptor(private val context: Context) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        if (context.isNetworkAvailable()) {
            val builder = chain.request().newBuilder()
            return chain.proceed(builder.build())
        } else {
            /**
             * [NetworkUnavailableException] will be catch in [invokeAsFlow] extension function
             * and transform to [NetworkResult.Error.InternetUnavailableException]
             */
            throw NetworkUnavailableException()
        }
    }
}
