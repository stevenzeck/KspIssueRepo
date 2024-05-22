package com.example.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Item::class], version = 1, exportSchema = false)
@TypeConverters(
    ItemConverters::class
)
abstract class MyDatabase : RoomDatabase() {

}
