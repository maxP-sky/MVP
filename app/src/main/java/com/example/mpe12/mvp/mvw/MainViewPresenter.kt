package com.example.mpe12.mvp.mvw

class MainViewPresenter {
    interface Presenter {
        fun setLayout(messages : ArrayList<String>)
    }
    interface Controller {
        fun getData(which: String)
        fun setData(messages: ArrayList<String>)
    }
    interface View {
        fun setLayoutView()
    }
}