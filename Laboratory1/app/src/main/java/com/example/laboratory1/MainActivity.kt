package com.example.laboratory1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterDestinationTxt = findViewById<EditText>(R.id.enterDestinationTxt)
        val navigateBtn= findViewById<Button>(R.id.navigateBtn)
        val textView2 = findViewById<TextView>(R.id.textView2)

        val receivedCity = intent.getStringExtra("cityName")

        textView2.text = "Last visit: " + receivedCity

        navigateBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("destinationName", enterDestinationTxt.text.toString());
            startActivity(intent)
        }
    }
}
