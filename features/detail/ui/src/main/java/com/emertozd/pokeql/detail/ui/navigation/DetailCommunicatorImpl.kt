package com.emertozd.pokeql.detail.ui.navigation

import com.core.ui.navigation.NavControllerHolder
import com.emertozd.pokeql.detail.shared.DetailCommunicator
import com.emertozd.pokeql.detail.shared.model.DetailArguments
import com.emertozd.pokeql.detail.ui.destinations.PokemonDetailScreenDestination
import com.emertozd.pokeql.detail.ui.model.PokemonDetailArgModel
import com.ramcosta.composedestinations.navigation.navigate
import javax.inject.Inject

class DetailCommunicatorImpl @Inject constructor(private val navControllerHolder: NavControllerHolder) :
    DetailCommunicator {
    override fun startFeature(detailArguments: DetailArguments) {
        navControllerHolder.getController()
            ?.navigate(PokemonDetailScreenDestination(detailArguments.toParcelable()))
    }

    private fun DetailArguments.toParcelable(): PokemonDetailArgModel {
        return with(this) {
            PokemonDetailArgModel(
                id = id,
            )
        }
    }
}