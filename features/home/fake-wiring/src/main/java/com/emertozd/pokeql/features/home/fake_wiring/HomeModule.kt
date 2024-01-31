package com.emertozd.pokeql.features.home.fake_wiring

import com.emertozd.pokeql.features.home.fake.usecase.FakeGetPokemonsPagingUseCaseImpl
import com.emertozd.pokeql.features.home.domain.usecase.GetPokemonsPagingUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface HomeModule {

    @Binds
    fun bindGetPokemonsPagingUseCase(getPokemonsPagingUseCaseImpl: FakeGetPokemonsPagingUseCaseImpl): GetPokemonsPagingUseCase

}