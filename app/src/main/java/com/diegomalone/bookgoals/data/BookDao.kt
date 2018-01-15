package com.diegomalone.bookgoals.data

import android.arch.persistence.room.*
import com.diegomalone.bookgoals.data.model.Book

/**
 * Created by Diego Malone on 15/01/18.
 */
@Dao
interface BookDao {

    @Query("select * from book")
    fun getAllBooks(): List<Book>

    @Query("select * from book where start_date is not null and done = :done")
    fun findStartedBooks(done: Boolean): List<Book>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBook(book: Book)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateBook(book: Book)

    @Delete
    fun deleteBook(book: Book)
}