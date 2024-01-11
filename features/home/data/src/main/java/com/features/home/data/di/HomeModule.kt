package com.features.home.data.di

import com.features.home.data.repository.HomeRepository
import com.features.home.data.repository.HomeRepositoryImpl
import com.features.home.data.usecase.GetPokemonsPagingUseCaseImpl
import com.features.home.domain.usecase.GetPokemonsPagingUseCase
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