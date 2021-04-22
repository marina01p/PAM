package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratory1.databinding.ActivityFourthBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding
    lateinit var bottomNavigation : BottomNavigationView

    private val quoteList: MutableList<String> = mutableListOf("A day without sunshine is like, you know, night.\n― Steve Martin ―",
                                                               "That which does not kill us makes us stronger.\n― Friedrich Nietzsche ―",
                                                               "If you judge people, you have no time to love them.\n― Mother Teresa ―",
                                                               "We don't see things as they are, we see them as we are.\n― Anaïs Nin ―",
                                                               "Sometimes the questions are complicated and the answers are simple.\n― Dr. Seuss ―",
                                                               "You can never get a cup of tea large enough or a book long enough to suit me.\n― C.S. Lewis ―",
                                                               "Some people never go crazy. What truly horrible lives they must lead.\n― Charles Bukowski ―",
                                                               "Some infinities are bigger than other infinities.\n― John Green ―",
                                                               "Never tell the truth to people who are not worthy of it.\n― Mark Twain ―",
                                                               "A day without laughter is a day wasted.\n― Nicolas Chamfort ―",
                                                               "Happiness in intelligent people is the rarest thing I know.\n― Ernest Hemingway ―",
                                                               "I became insane, with long intervals of horrible sanity.\n― Edgar Allan Poe ―",
                                                               "Never memorize something that you can look up.\n― Albert Einstein ―",
                                                               "The planet is fine. The people are f***ed.\n― George Carlin―")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.genRandomBtn.setOnClickListener() {
            val random = (0 until(quoteList.size)).random()
            binding.genQuoteTextView.text = quoteList[random]
        }

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.selectedItemId = R.id.randomise
        bottomNavigation.performClick()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.my_profile -> {
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                }
                R.id.posts -> {
                    val intent = Intent(this, FifthActivity::class.java)
                    startActivity(intent)
                }
                R.id.randomise -> {
                    val intent = Intent(this, FourthActivity::class.java)
                    startActivity(intent)
                }
                R.id.users -> {
                    val intent = Intent(this, SixthActivity::class.java)
                    startActivity(intent)
                }
                R.id.exit -> {
                    finishAffinity()
                }
            }
            true
        }
    }


}