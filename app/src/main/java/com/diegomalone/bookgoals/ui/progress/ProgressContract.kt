package com.diegomalone.bookgoals.ui.progress

import com.diegomalone.bookgoals.base.BasePresenter
import com.diegomalone.bookgoals.base.BaseView
import com.diegomalone.bookgoals.data.model.Book

/**
 * Created by Diego Malone on 15/01/18.
 */
interface ProgressContract {
    interface View : BaseView {
        fun showCurrentBookProgress(book: Book)
    }

    interface Presenter : BasePresenter<View> {
        fun getCurrentBook()
    }
}