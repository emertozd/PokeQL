package com.features.detail.domain.model
data class PokemonDetailDomainModel(
//    val abilities: List<AbilityDomainModel>?,
    val baseExperience: Int?,
//    val forms: List<FormDomainModel>?,
    val height: Int?,
    val id: Int?,
    val isDefault: Boolean?,
//    val locationAreaEncounters: String?,
    val name: String?,
    val order: Int?,
    val stats: List<StatDomainModel>?,
//    val types: List<TypeDomainModel>?,
    val weight: Int?,
//    val status: Boolean?,
//    val message: String?,
    val description: String?,
    val types: List<PokemonType>?
)

data class StatDomainModel(
    val name: String?,
    val effort: Int?,
    val stat: Int?,
)
