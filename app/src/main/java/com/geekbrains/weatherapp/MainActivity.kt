package com.geekbrains.weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.weatherapp.ui.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    val apiKey = "972d8c9e-e8f1-447c-b2a7-bd6c303c8f34"
}