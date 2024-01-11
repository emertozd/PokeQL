package com.features.detail.data.di

import com.features.detail.data.repository.DetailRepository
import com.features.detail.data.repository.DetailRepositoryImpl
import com.features.detail.data.usecase.GetPokemonDetailUseCaseImpl
import com.features.detail.domain.usecase.GetPokemonDetailUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DetailModule {

    @Binds
    fun bindDetailRepository(detailRepositoryImpl: DetailRepositoryImpl): DetailRepository

    @Binds
    fun bindGetPokemonDetailUseCase(getPokemonDetailUseCaseImpl: GetPokemonDetailUseCaseImpl): GetPokemonDetailUseCase
}