package com.example.roomsample

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface LocationListDao {
    @Query("SELECT * FROM LocationList")
     fun getAll():LiveData<List<LocationList>>



    @Insert
     suspend fun insert(todo: LocationList)

    @Update
     suspend fun update(todo: LocationList)

    @Delete
     suspend fun delete(todo: LocationList)
}