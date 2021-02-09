package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigateBtn = findViewById<Button>(R.id.navigateBtn)
        val textView2 = findViewById<TextView>(R.id.textView2)

        val receivedCity = intent.getStringExtra("cityName")

        option = findViewById(R.id.countrySpinner)
        result = findViewById(R.id.spinnerTextView)

        val options = arrayOf("Spain", "France", "Italy")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = "Please Select a Country"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {
                result.text = options[position]
            }
        }

        navigateBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("destinationName", result.text.toString());
            startActivity(intent)

        }

        if (receivedCity.isNullOrEmpty()) {
            textView2.visibility = View.GONE;
        } else {
            textView2.text = "Last visit: " + receivedCity
        }

    }
}
