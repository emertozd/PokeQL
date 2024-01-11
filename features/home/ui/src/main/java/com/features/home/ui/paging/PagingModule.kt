package com.features.home.ui.paging

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.features.home.domain.model.PokemonDomainModel
import com.features.home.domain.usecase.GetPokemonsPagingUseCase
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
                pageSize = 18,
                prefetchDistance = 3,
                initialLoadSize = 24
            ),
            pagingSourceFactory = {
                PokemonsPagingSource(getPokemonsPagingUseCase)
            }
        ).flow
}