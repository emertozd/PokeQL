package com.emertozd.pokeql.features.detail.ui.navigation

import com.emertozd.pokeql.core.ui.navigation.NavigationNode
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @IntoSet
    @Binds
    fun bindNavigationNode(detailNavigationNode: PokemonDetailNavigationNode): NavigationNode
}