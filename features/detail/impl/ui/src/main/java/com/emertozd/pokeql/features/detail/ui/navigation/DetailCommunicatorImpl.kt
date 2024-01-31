package com.emertozd.pokeql.features.detail.ui.navigation

import com.emertozd.pokeql.core.ui.navigation.NavControllerHolder
import com.emertozd.pokeql.features.detail.shared.DetailCommunicator
import com.emertozd.pokeql.features.detail.shared.model.DetailArguments
import com.emertozd.pokeql.features.detail.ui.destinations.PokemonDetailScreenDestination
import com.emertozd.pokeql.features.detail.ui.model.PokemonDetailArgModel
import com.ramcosta.composedestinations.navigation.navigate
import javax.inject.Inject

class DetailCommunicatorImpl @Inject constructor(private val navControllerHolder: NavControllerHolder) :
    DetailCommunicator {
    override fun startFeature(detailArguments: DetailArguments) {
        navControllerHolder.getController()?.navigate(PokemonDetailScreenDestination(detailArguments.toParcelable()))
    }

    private fun DetailArguments.toParcelable(): PokemonDetailArgModel {
        return with(this) {
            PokemonDetailArgModel(
                id = id,
            )
        }
    }
}