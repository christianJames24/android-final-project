# android-final-project

A simple Android app to browse and view Pokémon information. Built with Kotlin for learning purposes.

## What it does

- Shows a list of Pokémon (currently has the Unova starters)
- Search/filter through the list
- Tap any Pokémon to see detailed stats
- View moves, abilities, and type effectiveness
- Check weaknesses and resistances

## Features

- **List View**: Scrollable list with search bar
- **Detail View**: Full stats including:
  - Base stats (HP, Attack, Defense, etc.)
  - Types and abilities
  - Move lists (Level-up, TM, Egg, Move Tutor)
  - Height, weight, gender ratio
  - Type matchups (weaknesses/resistances)

## Setup

1. Clone this repo
2. Open in Android Studio
3. Build and run on emulator or device
4. Minimum SDK: 28 (Android 9.0)

## Tech Stack

- Kotlin
- Android SDK 34
- ViewBinding
- Fragments for navigation
- No external libraries (just AndroidX)

## Project Structure
app/src/main/java/
├── MainActivity.kt
├── PokemonListFragment.kt
├── PokemonDetailFragment.kt
├── Pokemon.kt
└── PokemonData.kt

## How to Use

1. Launch app → see Pokémon list
2. Use search bar to filter by name/ID
3. Tap any Pokémon to see details
4. Press back or "Return to Menu" button to go back

## Adding More Pokémon

Edit `PokemonData.kt` and add new entries to the `samplePokemons` list. Just copy the format of existing entries.

## Notes

- Images should be in `res/drawable/` folder
- Currently has 10 Pokémon (N + Gen 5 starters)
- Type effectiveness calculations included

---

Built as a learning project. Feel free to use/modify.
