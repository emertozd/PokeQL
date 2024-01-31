package com.emertozd.pokeql.features.home.ui.paging

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.emertozd.pokeql.features.home.domain.model.PokemonDomainModel
import com.emertozd.pokeql.features.home.domain.usecase.GetPokemonsPagingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow

@Module
@InstallIn(SingletonComponent::class)
object PagingModule {

    @Provides
    fun providePagingData(
        getPokemonsPagingUseCase: GetPokemonsPagingUseCase,
    ): Flow<PagingData<PokemonDomainModel>> =
        Pager(
            config = PagingConfig(
                pageSize = 10,
//                prefetchDistance = 3,
//                initialLoadSize = 24
            ),
            pagingSourceFactory = {
                PokemonPagingSource(getPokemonsPagingUseCase)
            }
        ).flow
}