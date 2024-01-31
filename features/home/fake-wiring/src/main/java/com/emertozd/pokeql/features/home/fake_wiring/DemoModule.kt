package com.emertozd.pokeql.features.home.fake_wiring

import com.emertozd.pokeql.features.home.shared.HomeCommunicator
import com.emertozd.pokeql.features.home.ui.navigation.HomeCommunicatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface DemoModule {

    @Binds
    fun bindHomeCommunicator(homeCommunicatorImpl: HomeCommunicatorImpl): HomeCommunicator
}