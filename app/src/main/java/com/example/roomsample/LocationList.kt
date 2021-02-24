package com.example.roomsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationList(
    @PrimaryKey(autoGenerate = false) var id: Int,
    @ColumnInfo(name = "dist_code") var dist_code: String,
    @ColumnInfo(name = "temp_code") var temp_code: String,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "depth3") var depth3: String,
    @ColumnInfo(name = "nX") var nX: Int,
    @ColumnInfo(name = "nY") var nY: Int
)



