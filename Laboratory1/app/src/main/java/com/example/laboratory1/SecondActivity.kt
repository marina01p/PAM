package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val textView = findViewById<TextView>(R.id.textView)
        val signGoTxt = findViewById<TextView>(R.id.signGoTxt)
        val goBackBtn = findViewById<Button>(R.id.goBackBtn)
        val usernameRegArea = findViewById<EditText>(R.id.usernameRegArea)
        val emailRegArea = findViewById<EditText>(R.id.emailRegArea)
        val passwordRegArea = findViewById<EditText>(R.id.passwordRegArea)
        val repeatPasswordRegArea = findViewById<EditText>(R.id.repeatPasswordRegArea)

        goBackBtn.setOnClickListener {
            if (usernameRegArea.text.trim().isNotEmpty() && emailRegArea.text.trim().isNotEmpty()
                    && passwordRegArea.text.trim().isNotEmpty() && repeatPasswordRegArea.text.trim().isNotEmpty()) {

                if (passwordRegArea.text.trim() == repeatPasswordRegArea.text.trim()) {
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
            }
        }

        signGoTxt.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}