package com.emertozd.pokeql.core.domain.model

sealed interface Result<out T> {
    data class Success<T>(val data: T) :
        Result<T>

    data class Error<T>(
        val errorMessage: String,
    ) : Result<T>
}