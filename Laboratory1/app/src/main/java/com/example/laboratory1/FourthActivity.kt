package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratory1.databinding.ActivityFourthBinding
import com.example.laboratory1.utils.AppConstants.bottomNavigation
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

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.selectedItemId = R.id.randomise
        bottomNavigation.performClick()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.my_profile -> { val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent) }
                R.id.posts -> { val intent = Intent(this, FifthActivity::class.java)
                    startActivity(intent) }
                R.id.randomise -> { val intent = Intent(this, FourthActivity::class.java)
                    startActivity(intent) }
                R.id.users -> { val intent = Intent(this, SixthActivity::class.java)
                    startActivity(intent) }
                R.id.games -> { val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent) }
            }
            true
        }
    }
}