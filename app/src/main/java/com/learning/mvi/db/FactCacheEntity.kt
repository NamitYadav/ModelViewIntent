package com.learning.mvi.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fact")
data class FactCacheEntity(

	@PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = "id")
	var id : Long = 0,

	@ColumnInfo(name = "info")
	var info : String,

	@ColumnInfo(name = "year")
	var year : Int,

	@ColumnInfo(name = "numberInput")
	var numberInput : Long,

	@ColumnInfo(name = "isDataAvailable")
	var isDataAvailable : Boolean,

	@ColumnInfo(name = "type")
	var type : String)
