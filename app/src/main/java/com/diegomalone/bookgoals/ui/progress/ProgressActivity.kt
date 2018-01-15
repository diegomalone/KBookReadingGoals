package com.diegomalone.bookgoals.ui.progress

import android.os.Bundle
import com.diegomalone.bookgoals.R
import com.diegomalone.bookgoals.base.BaseActivity
import com.diegomalone.bookgoals.data.model.Book
import com.diegomalone.bookgoals.extension.appComponent
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Diego Malone on 15/01/18.
 */
class ProgressActivity : BaseActivity(), ProgressContract.View {

    @Inject
    lateinit var presenter: ProgressContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        appComponent.inject(this)

        presenter.attachView(this)
        presenter.getCurrentBook()
    }

    override fun showCurrentBookProgress(book: Book) {
        Timber.i("Show book")
    }
}