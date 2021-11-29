package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var kotlinButton: Button
    lateinit var androidButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.kotlinButton)
        androidButton = findViewById(R.id.androidButton)

        kotlinButton.setOnClickListener {
            CardInfo.type = 0
            val intent = Intent(this, CardsActivity::class.java)
            startActivity(intent)
        }

        androidButton.setOnClickListener {
            CardInfo.type = 1
            val intent = Intent(this, CardsActivity::class.java)
            startActivity(intent)
        }
    }

}