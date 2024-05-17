package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "ITEM")
data class Item(
    @PrimaryKey
    val id: Int,
    val name: String
)