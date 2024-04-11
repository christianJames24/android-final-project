package com.example.bobbysandroidstartersolution

import java.io.Serializable

data class Pokemon(
    val id: Int,
    val name: String,
    val pokemonClassification: String,
    val pokemonDescription: String,
    val eggGroup: String,
    val type: List<String>,
    val abilities: List<String>,
    val hiddenAbility: String,
    val levelUpAttacks: List<String>,
    val tmAttacks: List<String>,
    val eggMoves: List<String>,
    val moveTutorAttacks: List<String>,
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
) : Serializable
