package com.example.mvipattern.Model

import com.example.mvipattern.View.MainViewState
import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable
import java.util.*

interface MainView : MvpView {
    val imageIntent:Observable<Int> //imageIntent will use integer index to get image from image list

    fun render(viewState: MainViewState)
}