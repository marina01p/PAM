package com.example.laboratory1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /////////////////////////////////////////
        val receivedDestination = intent.getStringExtra("destinationName")

        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)
        val goBackBtn = findViewById<Button>(R.id.goBackBtn)

        textViewMessage.text="Welcome to "+ receivedDestination

        goBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}