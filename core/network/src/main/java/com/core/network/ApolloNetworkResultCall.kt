package com.core.network

import com.apollographql.apollo3.ApolloCall
import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.Error
import com.apollographql.apollo3.api.Operation
import com.apollographql.apollo3.exception.ApolloNetworkException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

object ApolloNetworkResultCall {
    fun <T : Operation.Data> ApolloCall<T>.invokeAsFlow(): Flow<NetworkResult<T>> {
        return toFlow()
            .map { parseResponse(it) }
            .catch { exception ->
                emit(
                    if (exception is ApolloNetworkException) {
                        NetworkResult.Error.InternetUnavailableException(NetworkError("Please check your internet connection"))
                    } else {
                        NetworkResult.Error.IOException(
                            NetworkError(
                                exception.message ?: DEFAULT_ERROR_MESSAGE
                            )
                        )
                    }
                )
            }
    }

    fun <T : Operation.Data> parseResponse(response: ApolloResponse<T>): NetworkResult<T> {
        return if (!response.hasErrors() && response.data != null) {
            NetworkResult.Success(response.data!!)
        } else {
            val error = response.errors?.firstOrNull()
            return NetworkResult.Error.IOException(
                NetworkError(
                    errorMessage = error.getMessage(),
                    errorCode = error.getErrorCode(),
                    errorBody = response.data
                )
            )
        }
    }

    fun Error?.getMessage(): String {
        return this?.message ?: DEFAULT_ERROR_MESSAGE
    }

    fun Error?.getErrorCode(): Int {
        return (this?.extensions?.get("response") as? LinkedHashMap<*, *>)?.get("status")
            ?.toString()
            ?.toIntOrNull() ?: 0
    }


}

private const val DEFAULT_ERROR_MESSAGE = "Something went wrong"
