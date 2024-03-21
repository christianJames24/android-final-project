package com.example.bobbysandroidstartersolution

class PokemonData {
    val oshawott = Pokemon(
        id = 501, // Pokémon ID for Oshawott
        name = "Oshawott",
        pokemonClassification = "Sea Otter Pokémon",
        pokemonDescription = "The scalchop on its stomach isn't just used for battle—it can be used to break open hard berries as well.",
        eggGroup = "Field",
        type = listOf("Water"),
        abilities = listOf("Torrent"),
        hiddenAbility = "Shell Armor",
        levelUpAttacks = listOf("Tackle", "Tail Whip", "Water Gun", "Water Sport"),
        tmAttacks = listOf("Hone Claws", "Work Up", "Scald"),
        eggMoves = listOf("Copycat", "Detect", "Air Slash"),
        malePercentage = 87.5f,
        femalePercentage = 12.5f,
        height = 0.5f, // Meters
        weight = 5.9f, // Kilograms
        baseHP = 55,
        baseAttack = 55,
        baseDefence = 45,
        baseSAttack = 63,
        baseSDefence = 45,
        baseSpeed = 45
    )
}