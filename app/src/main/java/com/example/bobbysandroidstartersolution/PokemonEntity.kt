package com.example.bobbysandroidstartersolution

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity
data class PokemonEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val pokemonClassification: String,
    val pokemonDescription: String,
    val eggGroup: String,
    @TypeConverters(PokemonTypeConverters::class) val type: List<String>,
    @TypeConverters(PokemonTypeConverters::class) val abilities: List<String>,
    val hiddenAbility: String,
    @TypeConverters(PokemonTypeConverters::class) val levelUpAttacks: List<String>,
    @TypeConverters(PokemonTypeConverters::class) val tmAttacks: List<String>,
    @TypeConverters(PokemonTypeConverters::class) val eggMoves: List<String>,
    val malePercentage: Float,
    val femalePercentage: Float,
    val height: Float,
    val weight: Float,
    val baseHP: Int,
    val baseAttack: Int,
    val baseDefence: Int,
    val baseSAttack: Int,
    val baseSDefence: Int,
    val baseSpeed: Int
)

fun Pokemon.toEntity(): PokemonEntity {
    return PokemonEntity(
        id = this.id,
        name = this.name,
        pokemonClassification = this.pokemonClassification,
        pokemonDescription = this.pokemonDescription,
        eggGroup = this.eggGroup,
        type = this.type,
        abilities = this.abilities,
        hiddenAbility = this.hiddenAbility,
        levelUpAttacks = this.levelUpAttacks,
        tmAttacks = this.tmAttacks,
        eggMoves = this.eggMoves,
        malePercentage = this.malePercentage,
        femalePercentage = this.femalePercentage,
        height = this.height,
        weight = this.weight,
        baseHP = this.baseHP,
        baseAttack = this.baseAttack,
        baseDefence = this.baseDefence,
        baseSAttack = this.baseSAttack,
        baseSDefence = this.baseSDefence,
        baseSpeed = this.baseSpeed
    )
}
