package com.example.laboratory1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FourthActivity : AppCompatActivity() {

    private val quoteList: MutableList<String> = mutableListOf("A day without sunshine is like, you know, night. ― Steve Martin",
                                                               "That which does not kill us makes us stronger. ― Friedrich Nietzsche",
                                                               "If you judge people, you have no time to love them. ― Mother Teresa",
                                                               "We don't see things as they are, we see them as we are. ― Anaïs Nin",
                                                               "Sometimes the questions are complicated and the answers are simple. ― Dr. Seuss",
                                                               "You can never get a cup of tea large enough or a book long enough to suit me. ― C.S. Lewis",
                                                               "Some people never go crazy. What truly horrible lives they must lead. ― Charles Bukowski",
                                                               "Some infinities are bigger than other infinities. ― John Green",
                                                               "Never tell the truth to people who are not worthy of it. ― Mark Twain",
                                                               "A day without laughter is a day wasted. ― Nicolas Chamfort",
                                                               "Happiness in intelligent people is the rarest thing I know. ― Ernest Hemingway",
                                                               "I became insane, with long intervals of horrible sanity. ― Edgar Allan Poe",
                                                               "Never memorize something that you can look up. ― Albert Einstein",
                                                               "The planet is fine. The people are f***ed. ― George Carlin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val genQuoteTextView= findViewById<TextView>(R.id.genQuoteTextView)
        val genRandomBtn = findViewById<Button>(R.id.genRandomBtn)

        genRandomBtn.setOnClickListener() {
            val random = (0 until(quoteList.size)).random()
            genQuoteTextView.text = quoteList[random]
        }
    }
}