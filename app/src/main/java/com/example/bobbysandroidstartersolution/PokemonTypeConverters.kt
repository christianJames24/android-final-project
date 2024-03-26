package com.example.bobbysandroidstartersolution

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PokemonTypeConverters {
    private val gson = Gson()

    @TypeConverter
    fun fromListToString(value: List<String>?): String {
        if (value == null) {
            return "[]"
        }
        return gson.toJson(value)
    }

    @TypeConverter
    fun fromStringToList(value: String): List<String> {
        if (value == "[]") {
            return emptyList()
        }
        val listType = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(value, listType)
    }
}
