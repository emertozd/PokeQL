package com.core.network.di

import android.content.Context
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.core.network.BuildConfig
import com.core.network.NetworkInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SingletonModule {

    @[Provides Singleton]
    fun provideApollo(okHttpClient: OkHttpClient): ApolloClient =
        ApolloClient.Builder()
            .serverUrl(BuildConfig.BASE_URL)
            .okHttpClient(okHttpClient)
            .build()

    @[Provides Singleton]
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        networkInterceptor: NetworkInterceptor,
        chuckerInterceptor: ChuckerInterceptor,
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(networkInterceptor)
            .addInterceptor(chuckerInterceptor)
            .build()

    @[Provides Singleton]
    fun provideNetworkInterceptor(@ApplicationContext context: Context): NetworkInterceptor =
        NetworkInterceptor(context)

    @[Provides Singleton]
    fun provideChuckerInterceptor(@ApplicationContext context: Context): ChuckerInterceptor =
        ChuckerInterceptor(context)

    @[Provides Singleton]
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val logLevel = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return HttpLoggingInterceptor().setLevel(logLevel)
    }
}