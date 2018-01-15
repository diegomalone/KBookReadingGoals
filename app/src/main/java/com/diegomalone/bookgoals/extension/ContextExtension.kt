package com.diegomalone.bookgoals.extension

import android.content.Context
import com.diegomalone.bookgoals.BookGoalsApplication

/**
 * Created by Diego Malone on 15/01/18.
 */
val Context.appComponent
    get() = (applicationContext as BookGoalsApplication).appComponent
