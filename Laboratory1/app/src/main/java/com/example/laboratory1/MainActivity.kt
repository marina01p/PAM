package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerGoTxt = findViewById<TextView>(R.id.registerGoTxt)
        val navigateBtn = findViewById<Button>(R.id.navigateBtn)
        val usernameLogArea = findViewById<EditText>(R.id.usernameLogArea)
        val passwordLogArea = findViewById<EditText>(R.id.passwordLogArea)

        navigateBtn.setOnClickListener {
            if(usernameLogArea.text.trim().isNotEmpty() && passwordLogArea.text.trim().isNotEmpty()) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("userNameLog", usernameLogArea.text.toString())
                startActivity(intent)
//                Toast.makeText(this,"Input provided",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Input required",Toast.LENGTH_LONG).show()
            }

        }

        registerGoTxt.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
