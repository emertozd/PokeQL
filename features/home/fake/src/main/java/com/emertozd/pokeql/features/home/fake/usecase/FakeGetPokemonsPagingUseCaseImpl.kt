package com.emertozd.pokeql.features.home.fake.usecase

import com.emertozd.pokeql.core.domain.FakeResultHolder
import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.features.home.domain.model.PokemonsQueryDomainModel
import com.emertozd.pokeql.features.home.domain.usecase.GetPokemonsPagingUseCase
import com.emertozd.pokeql.features.home.fake.MockData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject


class FakeGetPokemonsPagingUseCaseImpl @Inject constructor(var result: FakeResultHolder) :
    GetPokemonsPagingUseCase {

    var maxLimit = 60;
    override fun execute(limit: Int, offset: Int): Flow<Result<PokemonsQueryDomainModel>> {
        return flowOf(
            when (result.getResult()) {
                is Result.Success -> {
                    if (maxLimit <= offset) {
                        Result.Success(PokemonsQueryDomainModel(results = mutableListOf()))
                    } else {
                        val mockResult =
                            (result.getResult() as? Result.Success)?.data as? PokemonsQueryDomainModel
                        if (mockResult != null)
                            Result.Success(mockResult)
                        else
                            Result.Success(MockData.getMockPokemonList(offset))
                    }
                }

                else -> Result.Error("Fake Error")
            }
        ).onStart {
            delay(5000)
        }
    }
}