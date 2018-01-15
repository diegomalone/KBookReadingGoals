package com.diegomalone.bookgoals.ui.progress

import android.util.Log
import com.diegomalone.bookgoals.data.AppDatabase
import com.diegomalone.bookgoals.data.model.Book
import com.diegomalone.bookgoals.di.AppComponent
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Diego Malone on 15/01/18.
 */
class ProgressPresenter(appComponent: AppComponent) : ProgressContract.Presenter {

    init {
        appComponent.inject(this)
    }

    private var view: ProgressContract.View? = null

    @Inject
    lateinit var appDatabase: AppDatabase

    override fun attachView(view: ProgressContract.View) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

    override fun getCurrentBook() {
        Timber.i("Getting a book")
        view?.showCurrentBookProgress(Book("", 200, null, null, false))
    }

}