package com.features.detail.domain.model

enum class PokemonType(type: String) {

    BUG("bug"),
    COLORLESS("normal"),
    DARKNESS("darkness"),
    DRAGON("dragon"),
    FAIRY("fairy"),
    FIGHTING("fighting"),
    FIRE("fire"),
    FLYING("flying"),
    GHOST("ghost"),
    GRASS("grass"),
    GROUND("ground"),
    ICE("ice"),
    LIGHTNING("electric"),
    METAL("steel"),
    POISON("poison"),
    PSYCHIC("psychic"),
    ROCK("rock"),
    WATER("water");


    companion object {
        fun fromString(type: String?): PokemonType {
            return when (type) {
                "normal" -> COLORLESS
                "darkness" -> DARKNESS
                "fighting" -> FIGHTING
                "fire" -> FIRE
                "grass" -> GRASS
                "electric" -> LIGHTNING
                "steel" -> METAL
                "psychic" -> PSYCHIC
                "water" -> WATER
                DRAGON.name -> DRAGON
                "bug" -> BUG
                "fairy" -> FAIRY
                "flying" -> FLYING
                "ghost" -> GHOST
                "ground" -> GROUND
                "ice" -> ICE
                "poison" -> POISON
                "rock" -> ROCK
                else -> COLORLESS
            }
        }
    }
}