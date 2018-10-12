package com.example.mpe12.mvp.presenters

import com.example.mpe12.mvp.mvw.*;

class MainPresenter(private val view : MainViewPresenter.View) : MainViewPresenter.Presenter {
    override fun setLayout(messages : ArrayList<String>) {
        messages.forEach{ println(it) }
        view.setLayoutView()
    }
}