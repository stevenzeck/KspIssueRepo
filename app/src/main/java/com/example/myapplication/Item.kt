package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
@Entity(tableName = "ITEM")
data class Item(
    @PrimaryKey
    val id: Int,
    val name: String
)

class ItemConverters {
    @TypeConverter
    fun fromItem(item: Item): String {
        return item.toString()
    }
}
