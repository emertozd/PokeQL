package com.emertozd.pokeql.features.home.impl_wiring

import com.emertozd.pokeql.features.home.shared.HomeCommunicator
import com.emertozd.pokeql.features.home.ui.navigation.HomeCommunicatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface CommunicatorModule {

    @Binds
    fun bindHomeCommunicator(homeCommunicatorImpl: HomeCommunicatorImpl): HomeCommunicator
}