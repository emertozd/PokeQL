package com.features.home.ui.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.core.domain.model.Result
import com.features.home.domain.model.PokemonDomainModel
import com.features.home.domain.usecase.GetPokemonsPagingUseCase
import kotlinx.coroutines.flow.first
import java.io.IOException
import javax.inject.Inject

class PokemonsPagingSource @Inject constructor(
    private val getPokemonsPagingUseCase: GetPokemonsPagingUseCase,
) : PagingSource<Int, PokemonDomainModel>() {

    private var pokemons = listOf<PokemonDomainModel>()
    private var hasMore = false
    private var nextCursor: Int = 0
    override fun getRefreshKey(state: PagingState<Int, PokemonDomainModel>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonDomainModel> {
        try {

            return when (val result =
                getPokemonsPagingUseCase.execute(params.loadSize, nextCursor).first()) {
                is Result.Success -> {

                    val responseModel = result.data
                    pokemons = responseModel?.results ?: listOf()
                    hasMore = (responseModel?.results?.size ?: 0) == 10
                    nextCursor += params.loadSize


                    LoadResult.Page(
                        data = pokemons,
                        prevKey = null,
                        nextKey = nextCursor
                    )
                }

                is Result.Error -> {
                    LoadResult.Error(Exception((result as? Result.Error)?.errorMessage ?: "Error"))
                }
            }

        } catch (exception: IOException) {
            exception.printStackTrace()
            return LoadResult.Error(exception)

        } catch (exception: Exception) {
            exception.printStackTrace()
            return LoadResult.Error(Exception("Error"))
        }
    }

}