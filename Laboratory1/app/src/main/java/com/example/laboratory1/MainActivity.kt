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
            if(usernameLogArea.text.trim().isNotEmpty()
                && usernameLogArea.text.toString() == "Marina"
                && passwordLogArea.text.trim().isNotEmpty()
                && passwordLogArea.text.toString() == "123") {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("userNameLog", usernameLogArea.text.toString())
                intent.putExtra("genderSpinner", "F")
                startActivity(intent)
            } else {
                Toast.makeText(this,"Wrong input | Input required",Toast.LENGTH_LONG).show()
            }
        }

        registerGoTxt.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
