package com.emertozd.pokeql.features.home.fake.communicator

import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.detail.shared.model.DetailArguments
import javax.inject.Inject

class FakeDetailCommunicatorImpl @Inject constructor() :
    DetailCommunicator {
    override fun startFeature(detailArguments: DetailArguments) {
        // no-op
    }
}