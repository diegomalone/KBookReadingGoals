package com.diegomalone.bookgoals.data

import android.arch.persistence.room.*
import com.diegomalone.bookgoals.data.model.ReadingGoal

/**
 * Created by Diego Malone on 15/01/18.
 */
@Dao
interface ReadingGoalDao {

    @Query("select * from reading_goal")
    fun getAllReadingGoals(): List<ReadingGoal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReadingGoal(readingGoal: ReadingGoal)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateReadingGoal(readingGoal: ReadingGoal)

    @Delete
    fun deleteReadingGoal(readingGoal: ReadingGoal)

}