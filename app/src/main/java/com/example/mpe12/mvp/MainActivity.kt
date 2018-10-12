package com.example.mpe12.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mpe12.mvp.controllers.MainController
import com.example.mpe12.mvp.mvw.MainViewPresenter
import com.example.mpe12.mvp.presenters.MainPresenter
import com.example.mpe12.mvp.views.MainView

class MainActivity : AppCompatActivity() {
    private val layoutView : MainViewPresenter.View = MainView(this)

    private val presenter : MainViewPresenter.Presenter = MainPresenter(layoutView)
    private val controller : MainViewPresenter.Controller = MainController(presenter)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val messages : ArrayList<String> = ArrayList()
        messages.add("Hello")

        controller.getData(messages)
    }
}
