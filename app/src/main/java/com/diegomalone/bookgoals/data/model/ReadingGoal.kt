package com.diegomalone.bookgoals.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by Diego Malone on 15/01/18.
 */
@Entity(tableName = "reading_goal")
data class ReadingGoal(@ColumnInfo(name = "book") var bookId: Long,
                       @ColumnInfo(name = "goal_date") var goalDate: Date) {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}