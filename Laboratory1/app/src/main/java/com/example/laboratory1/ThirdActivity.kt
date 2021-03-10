package com.example.laboratory1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val goToListBtn = findViewById<Button>(R.id.goToListBtn)
        val userName = findViewById<TextView>(R.id.userName)
        val goToMainBtn = findViewById<Button>(R.id.goToMainBtn)
        val setAvatar = findViewById<ImageView>(R.id.setAvatar)
        val yourTxtArea = findViewById<EditText>(R.id.yourTxtArea)
        val goToRandomBtn = findViewById<Button>(R.id.goToRandomBtn)
        val button = findViewById<Button>(R.id.button)

//        yourTxtArea.addTextChangedListener(object: TextWatcher{
//            override fun afterTextChanged(s: Editable?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                val thisInput = yourTxtArea.text.toString().trim()
//
//                if (thisInput.isNotEmpty()) {
//                goToListBtn.isEnabled
//            }
//        }})


        val receivedLogName = intent.getStringExtra("userNameLog")
        val receivedRegName = intent.getStringExtra("userNameReg")

        if(receivedLogName != null) {
            userName.text = "$receivedLogName"
        } else {
            userName.text = "$receivedRegName"
        }

        val receivedGender = intent.getStringExtra("genderSpinner")

        if(receivedGender == "F") {
            setAvatar.setImageResource(R.drawable.avatar_female_img)
        } else if (receivedGender == "M") {
            setAvatar.setImageResource(R.drawable.avatar_male_img)
        }

        goToListBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("myName", userName.text.toString())
            intent.putExtra("myPost", yourTxtArea.text.toString())
//            intent.putExtra("myAvatar", setAvatar.tag as Int)
            startActivity(intent)
        }

        goToMainBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

        goToRandomBtn.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }


    }
}