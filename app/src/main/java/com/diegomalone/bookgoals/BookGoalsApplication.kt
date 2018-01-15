package com.diegomalone.bookgoals

import android.app.Application
import com.diegomalone.bookgoals.di.AppComponent
import com.diegomalone.bookgoals.di.DaggerAppComponent
import com.diegomalone.bookgoals.di.module.AppModule
import timber.log.Timber

/**
 * Created by Diego Malone on 15/01/18.
 */
class BookGoalsApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        configureExceptionLogging()
        buildComponent()
    }

    fun configureExceptionLogging() {
        val default = Thread.getDefaultUncaughtExceptionHandler()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        Thread.setDefaultUncaughtExceptionHandler { thread, e ->
            Timber.e(e)
            default.uncaughtException(thread, e)
        }
    }

    fun buildComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}