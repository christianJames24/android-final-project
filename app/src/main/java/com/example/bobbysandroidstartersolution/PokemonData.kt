package com.example.bobbysandroidstartersolution

object PokemonData {
    val samplePokemons = listOf(
        Pokemon(
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
        ),
        Pokemon(
            id = 498,
            name = "Tepig",
            pokemonClassification = "The Fire Pig Pokémon",
            pokemonDescription = "It loves to eat roasted berries, but sometimes it gets too excited and burns them to a crisp.",
            eggGroup = "Field",
            type = listOf("Fire"),
            abilities = listOf("Blaze"),
            hiddenAbility = "Thick Fat",
            levelUpAttacks = listOf("Tackle", "Tail Whip", "Ember", "Odor Sleuth", "Defence Curl", "Flame Charge", "Smog", "Rollout", "Take Down", "Heat Crash", "Assurance", "Flamethrower", "Head Smash", "Roar", "Flare Blitz"),
            tmAttacks = listOf("Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Frustration", "Solarbeam", "Return", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Incinerate", "Will-o-wisp", "Gyro Ball", "Grass Knot", "Swagger", "Substitute", "Wild Charge", "Rock Smash", "Strength"),
            eggMoves = listOf("Covet", "Body Slam", "Thrash", "Magnitude", "Superpower", "Curse", "Endeavor", "Yawn", "Sleep Talk", "Heavy Slam"),
            moveTutorAttacks = listOf("Covet", "Endeavor", "Fire Pledge", "Heat Wave", "Helping Hand", "Iron Tail", "Sleep Talk", "Snore", "Superpower"),
            malePercentage = 87.5f,
            femalePercentage = 12.5f,
            height = 0.5f,
            weight = 9.9f,
            baseHP = 65,
            baseAttack = 63,
            baseDefence = 45,
            baseSAttack = 45,
            baseSDefence = 45,
            baseSpeed = 45
        ),
        Pokemon(
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
    )
}
