package com.learning.mvi.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.learning.mvi.db.FactCacheEntity


@Database(entities = [FactCacheEntity::class], version = 2)
abstract class FactDatabase : RoomDatabase() {
	abstract fun factDao() : FactDao

	companion object {
		val DATABASE_NAME = "fact_db"
	}
}