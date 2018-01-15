package com.diegomalone.bookgoals.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by Diego Malone on 15/01/18.
 */
@Entity(tableName = "book")
data class Book(@ColumnInfo(name = "name") var name: String,
                @ColumnInfo(name = "pages") var pages: Int,
                @ColumnInfo(name = "start_date") var startDate: Date?,
                @ColumnInfo(name = "finish_date") var finishDate: Date?,
                @ColumnInfo(name = "done") var done: Boolean) {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}