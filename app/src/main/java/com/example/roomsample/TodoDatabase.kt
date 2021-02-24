package com.example.roomsample

import android.R
import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [LocationList::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun locationListDao(): LocationListDao

    /* private var INSTANCE: TodoDatabase? = null


     open fun getDatabase(context: Context): TodoDatabase? {

     }
 */

}