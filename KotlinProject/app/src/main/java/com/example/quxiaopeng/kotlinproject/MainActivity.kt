package com.example.quxiaopeng.kotlinproject

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    var textView: TextView? = null
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv_text) as TextView?
        button = findViewById(R.id.btn_button) as Button?
        button?.setOnClickListener { view: View -> textView?.setText("hhh")}
    }
}
