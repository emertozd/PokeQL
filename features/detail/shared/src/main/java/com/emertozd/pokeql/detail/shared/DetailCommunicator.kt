package com.emertozd.pokeql.detail.shared

import com.emertozd.pokeql.detail.shared.model.DetailArguments

interface DetailCommunicator {
    fun startFeature(detailArguments: DetailArguments)
}