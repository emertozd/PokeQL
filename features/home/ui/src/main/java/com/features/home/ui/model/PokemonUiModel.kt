package com.features.home.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonUiModel(
    val id: Int?,
    val name: String?,
) : Parcelable
