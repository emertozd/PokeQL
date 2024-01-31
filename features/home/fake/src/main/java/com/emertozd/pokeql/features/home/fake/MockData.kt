package com.emertozd.pokeql.features.home.fake

import com.emertozd.pokeql.features.home.domain.model.PokemonDomainModel
import com.emertozd.pokeql.features.home.domain.model.PokemonsQueryDomainModel


object MockData {

    fun getMockPokemonList(offset: Int): PokemonsQueryDomainModel {
        return PokemonsQueryDomainModel(
            results = mutableListOf<PokemonDomainModel>().apply {
                for (i in offset + 1..offset + 30) {
                    val pokemon = PokemonDomainModel(
                        name = "pokemon$i",
                        id = i
                    )
                    this.add(pokemon)
                }
            }
        )
    }
}
