package com.emertozd.pokeql.features.detail.di

import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.detail.ui.navigation.DetailCommunicatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface CommunicatorModule {

    @Binds
    fun bindDetailCommunicator(detailCommunicatorImpl: DetailCommunicatorImpl): DetailCommunicator
}