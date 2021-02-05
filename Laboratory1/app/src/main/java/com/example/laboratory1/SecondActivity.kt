package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedDestination = intent.getStringExtra("destinationName")

        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)
        val goBackBtn = findViewById<Button>(R.id.goBackBtn)
        val txtArea = findViewById<EditText>(R.id.txtArea)
        val italyImg = findViewById<ImageView>(R.id.italyImg)
        val franceImg = findViewById<ImageView>(R.id.franceImg)
        val spainImg = findViewById<ImageView>(R.id.spainImg)
        val goBtn = findViewById<Button>(R.id.goBtn)

        textViewMessage.text = "Welcome to $receivedDestination"

        goBtn.setOnClickListener {
            if (receivedDestination == "Italy") {
                italyImg.visibility = View.VISIBLE;
            } else if (receivedDestination == "France") {
                franceImg.visibility = View.VISIBLE;
            } else if (receivedDestination == "Spain") {
                spainImg.visibility = View.VISIBLE;
            }
        }

        goBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("cityName", txtArea.text.toString());
            startActivity(intent)
        }
    }
}