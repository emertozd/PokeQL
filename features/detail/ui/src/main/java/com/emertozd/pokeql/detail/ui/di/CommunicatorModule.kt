package com.emertozd.pokeql.detail.ui.di

import com.emertozd.pokeql.detail.shared.DetailCommunicator
import com.emertozd.pokeql.detail.ui.navigation.DetailCommunicatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface CommunicatorModule {

    @Binds
    fun bindDetailCommunicator(detailCommunicatorImpl: DetailCommunicatorImpl): DetailCommunicator
}