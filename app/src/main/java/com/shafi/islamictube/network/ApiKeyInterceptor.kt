package com.shafi.islamictube.network

import okhttp3.Interceptor
import okhttp3.Response
import com.shafi.islamictube.BuildConfig

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalUrl = originalRequest.url

        val newUrl = originalUrl.newBuilder()
            .addQueryParameter("api_key", BuildConfig.API_KEY) //BuildConfig.API_KEY
            .build()

        val newRequest = originalRequest.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }
}