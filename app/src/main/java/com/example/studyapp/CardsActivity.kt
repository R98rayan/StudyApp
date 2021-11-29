package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardsActivity : AppCompatActivity() {

    lateinit var myRV: RecyclerView
    lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        CardInfo.initCards()

        myRV = findViewById<RecyclerView>(R.id.rvMain)

        if(CardInfo.type == 0) {
            myRV.adapter = RecyclerViewAdapter(this, CardInfo.kotlinList)
            setTitle("Kotlin Review")
        }
        else {
            myRV.adapter = RecyclerViewAdapter(this, CardInfo.androidList)
            setTitle("Android Review")
        }

        myRV.layoutManager = LinearLayoutManager(this)

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

}