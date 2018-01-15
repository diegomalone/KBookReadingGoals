package com.diegomalone.bookgoals.di

import com.diegomalone.bookgoals.di.module.ActivityModule
import com.diegomalone.bookgoals.di.module.AppModule
import com.diegomalone.bookgoals.di.module.PresenterModule
import com.diegomalone.bookgoals.ui.progress.ProgressActivity
import com.diegomalone.bookgoals.ui.progress.ProgressPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Diego Malone on 15/01/18.
 */
@Singleton
@Component(modules = [AppModule::class, ActivityModule::class, PresenterModule::class])
interface AppComponent {

    fun inject(progressActivity: ProgressActivity)

    fun inject(progressPresenter: ProgressPresenter)
}