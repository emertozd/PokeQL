package com.emertozd.pokeql.navigation

import com.core.ui.navigation.NavControllerHolder
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
}
