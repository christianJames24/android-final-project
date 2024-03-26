package com.example.bobbysandroidstartersolution

class PokemonData {
    val example = Pokemon(
        id = 0,
        name = "Example",
        pokemonClassification = "The Example Pokémon",
        pokemonDescription = "So I don't have to redo this too many times",
        eggGroup = "Field",
        type = listOf("Normal", "Dragon"),
        abilities = listOf("Wonder Guard", "Sturdy"),
        hiddenAbility = "Static",
        levelUpAttacks = listOf("Hyper Beam", "Giga Impact", "Dragon Rush", "Dragon Claw"),
        tmAttacks = listOf("Toxic", "Hail", "Blizzard", "Hidden Power"),
        eggMoves = listOf("Aura Sphere", "Dragon Pulse"),
        moveTutorAttacks = listOf("Sleep Talk", "Helping Hand"),
        malePercentage = 50.0f,
        femalePercentage = 50.0f,
        height = 0.1f,
        weight = 0.2f,
        baseHP = 40,
        baseAttack = 100,
        baseDefence = 154,
        baseSAttack = 250,
        baseSDefence = 154,
        baseSpeed = 100
    )

    val snivy = Pokemon(
        id = 495,
        name = "Snivy",
        pokemonClassification = "The Grass Snake Pokémon",
        pokemonDescription = "Being exposed to sunlight makes its movements swifter. It uses vines more adeptly than its hands",
        eggGroup = "Field",
        type = listOf("Grass"),
        abilities = listOf("Overgrow"),
        hiddenAbility = "Contrary",
        levelUpAttacks = listOf("Tackle", "Leer", "Vine Whip", "Wrap", "Growth", "Leaf Tornado", "Leech Seed", "Mega Drain", "Slam", "Leaf Blade", "Coil", "Giga Drain", "Wring Out", "Gastro Acid", "Leaf Storm"),
        tmAttacks = listOf("Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Light Screen", "Protect", "Safeguard", "Frustration", "Solarbeam", "Return", "Double Team", "Reflect", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Flash", "Swords Dance", "Grass Knot", "Swagger", "Substitute", "Cut"),
        eggMoves = listOf("Captivate", "Natural Gift", "Glare", "Iron Tail", "Magical Leaf", "Sweet Scent", "Mirror Coat", "Pursuit", "Mean Look", "Twister"),
        moveTutorAttacks = listOf("Aqua Tail", "Bind", "Gastro Acid", "Giga Drain", "Grass Pledge", "Iron Tail", "Knock Off", "Seed Bomb", "Sleep Talk", "Snatch", "Snore", "Synthesis", "Worry Seed"),
        malePercentage = 87.5f,
        femalePercentage = 12.5f,
        height = 0.6f,
        weight = 8.1f,
        baseHP = 45,
        baseAttack = 45,
        baseDefence = 55,
        baseSAttack = 45,
        baseSDefence = 55,
        baseSpeed = 63
    )

    val servine = Pokemon(
        id = 496,
        name = "Servine",
        pokemonClassification = "The Grass Snake Pokémon",
        pokemonDescription = "When it gets dirty, its leaves can't be used in photosynthesis, so it always keeps itself clean.",
        eggGroup = "Field",
        type = listOf("Grass"),
        abilities = listOf("Overgrow"),
        hiddenAbility = "Contrary",
        levelUpAttacks = listOf("Tackle", "Leer", "Vine Whip", "Wrap", "Leer", "Vine Whip", "Wrap", "Growth", "Leaf Tornado", "Leech Seed", "Mega Drain", "Slam", "Leaf Blade", "Coil", "Giga Drain", "Wring Out", "Gastro Acid", "Leaf Storm"),
        tmAttacks = listOf("Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Light Screen", "Protect", "Safeguard", "Frustration", "Solarbeam", "Return", "Double Team", "Reflect", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Flash", "Swords Dance", "Grass Knot", "Swagger", "Substitute", "Cut"),
        eggMoves = listOf("Captivate", "Natural Gift", "Glare", "Iron Tail", "Magical Leaf", "Sweet Scent", "Mirror Coat", "Pursuit", "Mean Look", "Twister"),
        moveTutorAttacks = listOf("Aqua Tail", "Bind", "Gastro Acid", "Giga Drain", "Grass Pledge", "Iron Tail", "Knock Off", "Seed Bomb", "Sleep Talk", "Snatch", "Snore", "Synthesis", "Worry Seed"),
        malePercentage = 87.5f,
        femalePercentage = 12.5f,
        height = 0.8f,
        weight = 16.0f,
        baseHP = 60,
        baseAttack = 60,
        baseDefence = 75,
        baseSAttack = 60,
        baseSDefence = 75,
        baseSpeed = 83
    )

    val oshawott = Pokemon(
        id = 501, // Pokémon ID for Oshawott
        name = "Oshawott",
        pokemonClassification = "Sea Otter Pokémon",
        pokemonDescription = "The scalchop on its stomach isn't just used for battle—it can be used to break open hard berries as well.",
        eggGroup = "Field",
        type = listOf("Water"),
        abilities = listOf("Torrent"),
        hiddenAbility = "Shell Armor",
        levelUpAttacks = listOf("Tackle", "Tail Whip", "Water Gun", "Water Sport", "Focus Energy", "Razor Shell", "Fury Cutter", "Water Pulse", "Revenge", "Aqua Jet", "Encore", "Aqua Tail", "Retaliate", "Swords Dance", "Hydro Pump"),
        tmAttacks = listOf("Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Project", "Rain Dance", "Frustration", "Return", "Dig", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "False Swipe", "Scald", "Fling", "Retaliate", "Swords Dance", "X-scissor", "Grass Knot", "Swagger", "Substitute", "Rock Smash", "Cut", "Surf", "Waterfall", "Dive"),
        eggMoves = listOf("Copycat", "Detect", "Air Slash", "Assurance", "Brine", "Night Slash", "Trump Card", "Screech"),
        moveTutorAttacks = listOf("Aqua Tail", "Covet", "Helping Hand", "Icy Wind", "Iron Tail", "Sleep Talk", "Snore", "Water Pledge"),
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