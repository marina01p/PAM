package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val spinnerTextView = findViewById<TextView>(R.id.spinnerTextView)
        val signGoTxt = findViewById<TextView>(R.id.signGoTxt)
        val goBackBtn = findViewById<Button>(R.id.goBackBtn)
        val usernameRegArea = findViewById<EditText>(R.id.usernameRegArea)
        val emailRegArea = findViewById<EditText>(R.id.emailRegArea)
        val passwordRegArea = findViewById<EditText>(R.id.passwordRegArea)
        val repeatPasswordRegArea = findViewById<EditText>(R.id.repeatPasswordRegArea)
        val options = arrayOf("M", "F")

        spinnerTextView.visibility = View.GONE

        option = findViewById(R.id.genderSpinner)
        result = findViewById(R.id.spinnerTextView)

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long) {
                result.text = options[position]
            }
        }

        goBackBtn.setOnClickListener {
            if (usernameRegArea.text.trim().isNotEmpty() && emailRegArea.text.trim().isNotEmpty()
                    && passwordRegArea.text.trim().isNotEmpty() && repeatPasswordRegArea.text.trim().isNotEmpty()) {

                if (passwordRegArea.text.trim() == repeatPasswordRegArea.text.trim()) {
                    val intent = Intent(this, ThirdActivity::class.java)
                    intent.putExtra("genderSpinner", result.text.toString());
                    intent.putExtra("userNameReg", usernameRegArea.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
            }
        }

        signGoTxt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}