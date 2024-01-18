package com.emertozd.pokeql.features.detail.demo.navigation

import com.emertozd.pokeql.core.domain.FakeResultHolder
import com.emertozd.pokeql.core.ui.navigation.NavControllerHolder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavControllerModule {

    @Provides
    @Singleton
    fun provideNavController(): NavControllerHolder = NavControllerHolder()

    @Provides
    @Singleton
    fun provideUseCaseResult(): FakeResultHolder = FakeResultHolder()
}
