package com.example.laboratory1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratory1.databinding.ActivityFourthBinding
import com.example.laboratory1.utils.AppFunctions.Companion.getPosts

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val quoteList = getPosts()

        binding.genRandomBtn.setOnClickListener() {
            val random = (0 until(13)).random()
            binding.genQuoteTextView.text = quoteList[random]
        }
    }
}