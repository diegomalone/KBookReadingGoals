package com.diegomalone.bookgoals.di.module

import com.diegomalone.bookgoals.BookGoalsApplication
import com.diegomalone.bookgoals.ui.progress.ProgressContract
import com.diegomalone.bookgoals.ui.progress.ProgressPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Diego Malone on 15/01/18.
 */
@Module
class PresenterModule {

    @Provides
    fun providesProgressPresenter(bookGoalsApplication: BookGoalsApplication): ProgressContract.Presenter =
            ProgressPresenter(bookGoalsApplication.appComponent)
}