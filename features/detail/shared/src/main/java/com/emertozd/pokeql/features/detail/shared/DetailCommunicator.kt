package com.emertozd.pokeql.features.detail.shared

import com.emertozd.pokeql.features.detail.shared.model.DetailArguments

interface DetailCommunicator {
    fun startFeature(detailArguments: DetailArguments)
}