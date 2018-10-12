package com.example.mpe12.mvp.views

import com.example.mpe12.mvp.MainActivity
import com.example.mpe12.mvp.R
import com.example.mpe12.mvp.mvw.MainViewPresenter

class MainView(private val activity : MainActivity) : MainViewPresenter.View {
    override fun setLayoutView() {
        activity.setContentView(R.layout.activity_main)
    }

}