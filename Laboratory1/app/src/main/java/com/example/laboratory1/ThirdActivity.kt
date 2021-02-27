package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val goToListBtn = findViewById<Button>(R.id.goToListBtn)
        val userName = findViewById<TextView>(R.id.userName)
        val goToMainBtn = findViewById<Button>(R.id.goToMainBtn)

        val receivedLogName = intent.getStringExtra("userNameLog")
        val receivedRegName = intent.getStringExtra("userNameReg")

        if(receivedLogName != null) {
            userName.text = "$receivedLogName"
        } else {
            userName.text = "$receivedRegName"
        }


        goToListBtn.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        goToMainBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}