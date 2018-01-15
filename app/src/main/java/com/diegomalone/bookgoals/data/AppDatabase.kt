package com.diegomalone.bookgoals.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.diegomalone.bookgoals.data.model.Book
import com.diegomalone.bookgoals.data.model.ReadingGoal

/**
 * Created by Diego Malone on 15/01/18.
 */
@Database(entities = [Book::class, ReadingGoal::class], version = 1, exportSchema = false)
@TypeConverters(RoomConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookDao(): BookDao

    abstract fun readingGoalDao(): ReadingGoalDao
}