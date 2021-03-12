package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    lateinit var option : Spinner
    lateinit var result : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val options = arrayOf("M", "F")

        binding.spinnerTextView.visibility = View.GONE

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

        binding.goBackBtn.setOnClickListener {
            if (binding.usernameRegArea.text.trim().isNotEmpty() && binding.emailRegArea.text.trim().isNotEmpty()
                    && binding.passwordRegArea.text.trim().isNotEmpty() && binding.repeatPasswordRegArea.text.trim().isNotEmpty()) {

                if (binding.passwordRegArea.text.trim() == binding.repeatPasswordRegArea.text.trim()) {
                    val intent = Intent(this, ThirdActivity::class.java)
                    intent.putExtra("genderSpinner", result.text.toString());
                    intent.putExtra("userNameReg", binding.usernameRegArea.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Input required", Toast.LENGTH_LONG).show()
            }
        }

        binding.signGoTxt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}