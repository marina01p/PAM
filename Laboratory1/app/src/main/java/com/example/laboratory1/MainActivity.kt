package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.navigateBtn.setOnClickListener {
            if(binding.usernameLogArea.text.trim().isNotEmpty()
                && binding.usernameLogArea.text.toString() == "Marina"
                && binding.passwordLogArea.text.trim().isNotEmpty()
                && binding.passwordLogArea.text.toString() == "123") {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("userNameLog", binding.usernameLogArea.text.toString())
                intent.putExtra("genderSpinner", "F")
                startActivity(intent)
            } else {
                Toast.makeText(this,"Wrong input | Input required",Toast.LENGTH_LONG).show()
            }
        }

        binding.registerGoTxt.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
