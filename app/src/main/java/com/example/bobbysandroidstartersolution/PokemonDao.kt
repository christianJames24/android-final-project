package com.example.bobbysandroidstartersolution

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PokemonDao {
    // Insert a PokemonEntity into the database
    @Insert
    suspend fun insert(pokemon: PokemonEntity)

    // Find a PokemonEntity by its ID
    @Query("SELECT * FROM PokemonEntity WHERE id = :id")
    suspend fun findById(id: Int): PokemonEntity?

    // Fetch all PokemonEntities from the database
    @Query("SELECT * FROM PokemonEntity")
    suspend fun getAllPokemons(): List<PokemonEntity>

    // Update a PokemonEntity in the database
    @Update
    suspend fun update(pokemon: PokemonEntity)

    // Delete a specific PokemonEntity by its ID
    @Query("DELETE FROM PokemonEntity WHERE id = :id")
    suspend fun deleteById(id: Int)

    // Optional: Delete all PokemonEntities
    @Query("DELETE FROM PokemonEntity")
    suspend fun deleteAll()
}
