package com.diegomalone.bookgoals.base

/**
 * Created by Diego Malone on 15/01/18.
 */
interface BasePresenter<in V : BaseView> {
    fun attachView(view: V)
    fun detachView()
}
