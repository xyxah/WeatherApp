package com.geekbrains.weatherapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.weatherapp.R
import com.geekbrains.weatherapp.view.details.DetailsFragment
import com.geekbrains.weatherapp.view.main.MainFragment

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

}