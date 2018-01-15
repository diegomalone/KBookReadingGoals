package com.diegomalone.bookgoals.data

import android.arch.persistence.room.TypeConverter
import java.util.*


/**
 * Created by Diego Malone on 15/01/18.
 */
class RoomConverter {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {

        value?.let {
            return Date(it)
        }

        return null
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}