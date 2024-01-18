package com.emertozd.pokeql.features.detail.fake.usecase

import com.emertozd.pokeql.core.domain.FakeResultHolder
import com.emertozd.pokeql.core.domain.model.Result
import com.emertozd.pokeql.features.detail.domain.model.PokemonDetailDomainModel
import com.emertozd.pokeql.features.detail.domain.usecase.GetPokemonDetailUseCase
import com.emertozd.pokeql.features.detail.fake.MockData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject


class FakePokemonDetailUseCaseImpl @Inject constructor(var result: FakeResultHolder) :
    GetPokemonDetailUseCase {
    override fun execute(id: Int): Flow<Result<PokemonDetailDomainModel>> = flowOf(
        when (result.getResult()) {
            is Result.Success -> {
                val mockResult = (result.getResult() as? Result.Success)?.data as? PokemonDetailDomainModel
                if (mockResult != null)
                    Result.Success(mockResult)
                else
                    Result.Success(MockData.mockDetailModel)
            }

            else -> Result.Error("Fake Error")
        }
    )
}