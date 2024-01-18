package com.emertozd.pokeql.features.detail.di

import com.emertozd.pokeql.features.detail.domain.repository.DetailRepository
import com.emertozd.pokeql.features.detail.data.repository.DetailRepositoryImpl
import com.emertozd.pokeql.features.detail.data.usecase.GetPokemonDetailUseCaseImpl
import com.emertozd.pokeql.features.detail.domain.usecase.GetPokemonDetailUseCase
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