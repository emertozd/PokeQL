package com.emertozd.pokeql.features.detail.di

import com.emertozd.pokeql.features.detail.fake.usecase.FakePokemonDetailUseCaseImpl
import com.emertozd.pokeql.features.detail.domain.usecase.GetPokemonDetailUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DetailModule {

    @Binds
    fun bindGetPokemonDetailUseCase(getPokemonDetailUseCaseImpl: FakePokemonDetailUseCaseImpl): GetPokemonDetailUseCase
}