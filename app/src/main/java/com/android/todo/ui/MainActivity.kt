package com.android.todo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.todo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
