package com.core.network

data class NetworkError<T>(
    val errorMessage: String,
    val errorCode: Int? = null,
    val errorBody: T? = null,
)