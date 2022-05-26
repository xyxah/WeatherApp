package com.geekbrains.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.geekbrains.weatherapp.pojo.Weather

class MainActivity : AppCompatActivity() {

    val apiKey = "972d8c9e-e8f1-447c-b2a7-bd6c303c8f34"

    //тестовые данные
    private val weathers = listOf<Weather>(
        Weather("Вчера","38°C"),
        Weather("Сегодня","21°C"),
        Weather("Завтра","29°C")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        var text = ""
        for(item in weathers){
            text += item.day + "-" + item.temperature + "\n"
        }

        val textView = findViewById<TextView>(R.id.text)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            textView.text = text
        }
    }
}