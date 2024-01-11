package com.features.home.data.repository

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.core.domain.model.Result
import com.core.network.ApolloNetworkResultCall.invokeAsFlow
import com.core.network.NetworkResult
import com.emertozd.pokeql.PokemonListQuery
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val apolloClient: ApolloClient,
) : HomeRepository {

    override fun getPokemons(limit: Int, offset: Int): Flow<Result<PokemonListQuery.Data>> {
        return apolloClient.query(
            PokemonListQuery(
                limit = Optional.present(limit),
                offset = Optional.presentIfNotNull(offset)
            )
        ).invokeAsFlow().map { networkResult ->
            when (networkResult) {
                is NetworkResult.Success -> {
                    Result.Success(networkResult.data)
                }

                is NetworkResult.Error -> {
                    Result.Error(networkResult.error.errorMessage)
                }
            }
        }
    }
}