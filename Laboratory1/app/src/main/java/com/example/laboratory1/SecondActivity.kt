package com.example.laboratory1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val receivedDestination = intent.getStringExtra("destinationName")

        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)

        textViewMessage.text="Welcome to "+ receivedDestination
    }
}