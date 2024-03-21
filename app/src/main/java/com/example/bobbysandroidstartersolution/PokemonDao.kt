package com.example.bobbysandroidstartersolution

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PokemonDao {
    @Insert
    suspend fun insert(pokemon: PokemonEntity)

    @Query("SELECT * FROM PokemonEntity WHERE id = :id")
    suspend fun findById(id: Int): PokemonEntity?
}
