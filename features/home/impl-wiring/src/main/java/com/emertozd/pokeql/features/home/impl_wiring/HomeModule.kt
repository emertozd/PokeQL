package com.emertozd.pokeql.features.home.impl_wiring

import com.emertozd.pokeql.features.home.domain.repository.HomeRepository
import com.emertozd.pokeql.features.home.data.repository.HomeRepositoryImpl
import com.emertozd.pokeql.features.home.data.usecase.GetPokemonsPagingUseCaseImpl
import com.emertozd.pokeql.features.home.domain.usecase.GetPokemonsPagingUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface HomeModule {

    @Binds
    fun bindHomeRepository(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository

    @Binds
    fun bindGetPokemonsPagingUseCase(getPokemonsPagingUseCaseImpl: GetPokemonsPagingUseCaseImpl): GetPokemonsPagingUseCase

}