package com.emertozd.pokeql.core.domain

import com.emertozd.pokeql.core.domain.model.Result
import javax.inject.Inject

class FakeResultHolder @Inject constructor() {

    private var result: Result<*>? = null

    fun setResult(result: Result<*>) {
        this.result = result
    }

    fun getResult(): Result<*>? {
        return result
    }
}