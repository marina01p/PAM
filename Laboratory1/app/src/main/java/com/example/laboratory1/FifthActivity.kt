package com.example.laboratory1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laboratory1.databinding.ActivityFifthBinding
import com.example.laboratory1.recycleView.RecycleAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.SimpleDateFormat
import java.util.*

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding
    lateinit var bottomNavigation : BottomNavigationView

    private var titleList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    private var timeList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        postToList()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = RecycleAdapter(titleList, descriptionList, imagesList, timeList)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = R.id.posts
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
                R.id.games -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
            }
            true
        }
    }

    private fun addToList(title: String, description: String, image: Int, time: String) {
        titleList.add(title)
        descriptionList.add(description)
        imagesList.add(image)
        timeList.add(time)
    }

    private fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
        val formatter = SimpleDateFormat(format, locale)
        return formatter.format(this)
    }

    private fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }

    @SuppressLint("SimpleDateFormat")
    private fun postToList() {

        val myName = intent.getStringExtra("myName")
        val myTxt = intent.getStringExtra("myPost")

        val date = getCurrentDateTime()
        val myTime = date.toString("HH:mm | dd/MM")

        if (myTxt != null && myName != null) {
            addToList(myName, myTxt, R.mipmap.female_avatar_round, myTime)
        }

        addToList("Matthew", "To be, or not to be, that is the question.", R.mipmap.male_avatar_round, "12:21 | 01/03")
        addToList("Scarlet", "You only live once, but if you do it right, once is enough.", R.mipmap.female_avatar_round, "14:14 | 25/02")
        addToList("Jason", "I have not failed. I've just found 10,000 ways that won't work.", R.mipmap.male_avatar_round, "15:01 | 21/02")
        addToList("Eleanor", "If you tell the truth, you don't have to remember anything.", R.mipmap.female_avatar_round, "14:32 | 15/02")
        addToList("Frederick", "We accept the love we think we deserve.", R.mipmap.male_avatar_round, "17:15 | 05/01")

        for (i in 7..30) {
            addToList("Cool name no. $i", "To lazy to write quote no. $i", R.mipmap.random_round, "11:10 | 01/01")
        }

    }
}