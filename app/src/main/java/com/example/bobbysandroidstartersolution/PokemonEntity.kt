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
