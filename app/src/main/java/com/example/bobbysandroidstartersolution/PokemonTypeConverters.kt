package com.example.bobbysandroidstartersolution

import androidx.room.TypeConverter

class PokemonTypeConverters {
    @TypeConverter
    fun fromListToString(value: List<String>): String = value.joinToString(separator = ",")

    @TypeConverter
    fun fromStringToList(value: String): List<String> = value.split(",")
}
