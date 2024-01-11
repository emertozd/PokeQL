package com.features.detail.data.repository

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.core.domain.model.Result
import com.core.network.ApolloNetworkResultCall.invokeAsFlow
import com.core.network.NetworkResult
import com.emertozd.pokeql.PokemonDetailQuery
import com.features.detail.data.mapper.toDomainModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DetailRepositoryImpl @Inject constructor(
    private val apolloClient: ApolloClient,
) : DetailRepository {
    override fun getPokemonDetail(id: Int): Flow<Result<PokemonDetailQuery.Data>> {

        return apolloClient.query(
            PokemonDetailQuery(
                id = Optional.present(id),
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