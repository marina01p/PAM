package com.example.laboratory1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratory1.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding

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
    }
}