package com.example.bobbysandroidstartersolution

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Use Coroutine to insert the data on a background thread
            lifecycleScope.launch {
                insertExamplePokemon()
                Toast.makeText(this@MainActivity, "Pokemon inserted!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private suspend fun insertExamplePokemon() {
        // Assuming PokemonData has a function to convert Pokemon to PokemonEntity
        val pokemonData = PokemonData()
        val pokemonEntity = pokemonData.example.toEntity()

        // Get an instance of the database and the DAO
        val db = AppDatabase.getDatabase(applicationContext)
        val pokemonDao = db.pokemonDao()

        // Insert the PokemonEntity into the database
        pokemonDao.insert(pokemonEntity)
    }
}
