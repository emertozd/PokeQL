package com.core.network

sealed interface NetworkResult<out T> {
    data class Success<T>(val data: T) : NetworkResult<T>

    sealed interface Error<T> : NetworkResult<T> {
        val error: NetworkError<T>

        data class IOException<T>(override val error: NetworkError<T>) : Error<T>

        /**
         * Represents the internet connection unavailability. We treat it as a general error for the simplicity.
         */
        data class InternetUnavailableException<T>(override val error: NetworkError<T>) : Error<T>
    }
}

