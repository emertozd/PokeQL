package com.emertozd.pokeql.core.network

data class NetworkError<T>(
    val errorMessage: String,
    val errorCode: Int? = null,
    val errorBody: T? = null,
)