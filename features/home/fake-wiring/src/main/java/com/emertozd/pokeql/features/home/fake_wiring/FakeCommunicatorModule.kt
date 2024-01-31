package com.emertozd.pokeql.features.home.fake_wiring

import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.home.fake.communicator.FakeDetailCommunicatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface FakeCommunicatorModule {

    @Binds
    fun bindDetailCommunicator(detailCommunicatorImpl: FakeDetailCommunicatorImpl): DetailCommunicator
}