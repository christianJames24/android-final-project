package com.example.bobbysandroidstartersolution

data class Pokemon(
    val id : Int,
    val name : String,
    val pokemonClassification : String,
    val pokemonDescription : String,

    val eggGroup : String,

    val type : List<String>,
    val abilities : List<String>,
    val hiddenAbility : String,

    val levelUpAttacks : List<String>,
    val tmAttacks : List<String>,
    val eggMoves : List<String>,
    val moveTutorAttacks : List<String>,

    val malePercentage : Float,
    val femalePercentage : Float,

    val height : Float,
    val weight : Float,

    val baseHP : Int,
    val baseAttack : Int,
    val baseDefence : Int,
    val baseSAttack : Int,
    val baseSDefence : Int,
    val baseSpeed : Int,
) {
    fun toEntity(pokemon: Pokemon): PokemonEntity {
        return PokemonEntity(
            id = pokemon.id,
            name = pokemon.name,
            pokemonClassification = pokemon.pokemonClassification,
            pokemonDescription = pokemon.pokemonDescription,
            eggGroup = pokemon.eggGroup,
            type = pokemon.type,
            abilities = pokemon.abilities,
            hiddenAbility = pokemon.hiddenAbility,
            levelUpAttacks = pokemon.levelUpAttacks,
            tmAttacks = pokemon.tmAttacks,
            eggMoves = pokemon.eggMoves,
            malePercentage = pokemon.malePercentage,
            femalePercentage = pokemon.femalePercentage,
            height = pokemon.height,
            weight = pokemon.weight,
            baseHP = pokemon.baseHP,
            baseAttack = pokemon.baseAttack,
            baseDefence = pokemon.baseDefence,
            baseSAttack = pokemon.baseSAttack,
            baseSDefence = pokemon.baseSDefence,
            baseSpeed = pokemon.baseSpeed
        )
    }

}


