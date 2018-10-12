package com.example.mpe12.mvp.controllers

import com.example.mpe12.mvp.mvw.MainViewPresenter

class MainController(private val presenter: MainViewPresenter.Presenter) : MainViewPresenter.Controller {
    override fun getData(which : String) {
        // Add some logic here .....
    }
    override fun setData(messages: ArrayList<String>) {
        presenter.setLayout(messages)
    }
}