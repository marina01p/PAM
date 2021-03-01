package com.example.laboratory1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val goToListBtn = findViewById<Button>(R.id.goToListBtn)
        val userName = findViewById<TextView>(R.id.userName)
        val goToMainBtn = findViewById<Button>(R.id.goToMainBtn)
        val setAvatar = findViewById<ImageView>(R.id.setAvatar)
        val yourTxtArea = findViewById<EditText>(R.id.yourTxtArea)

        val receivedLogName = intent.getStringExtra("userNameLog")
        val receivedRegName = intent.getStringExtra("userNameReg")

        if(receivedLogName != null) {
            userName.text = "$receivedLogName"
        } else {
            userName.text = "$receivedRegName"
        }

        val receivedGender = intent.getStringExtra("genderSpinner")

        if(receivedGender == "F") {
            setAvatar.setImageResource(R.drawable.avatar_img)
        } else if (receivedGender == "M") {
            setAvatar.setImageResource(R.drawable.avatar_male_img)
        }

        goToListBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("myName", userName.text.toString())
            intent.putExtra("myPost", yourTxtArea.text.toString())
            intent.putExtra("myAvatar", setAvatar.tag as Int?)
            startActivity(intent)
        }

        goToMainBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}