package com.diegomalone.bookgoals.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.diegomalone.bookgoals.BookGoalsApplication
import com.diegomalone.bookgoals.data.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Diego Malone on 15/01/18.
 */
@Module
class AppModule(private val application: BookGoalsApplication) {

    companion object {
        val DATABASE_NAME = "book-goals-db"
    }

    @Provides
    @Singleton
    fun providesApplicationContext(): Context = application

    @Provides
    @Singleton
    fun providesBookGoalsApplication(): BookGoalsApplication = application

    @Provides
    @Singleton
    fun providesApplication(): Application = application

    @Provides
    fun providesAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()

    @Provides
    fun providesBookDao(database: AppDatabase) = database.bookDao()

    @Provides
    fun providesReadingGoalDao(database: AppDatabase) = database.readingGoalDao()
}