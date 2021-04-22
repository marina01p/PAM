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

        addToList(getString(R.string.r_user_name_01), getString(R.string.r_user_quote_01), R.mipmap.male_avatar_round, getString(R.string.r_post_time_01))
        addToList(getString(R.string.r_user_name_02), getString(R.string.r_user_quote_02), R.mipmap.female_avatar_round, getString(R.string.r_post_time_02))
        addToList(getString(R.string.r_user_name_03), getString(R.string.r_user_quote_03), R.mipmap.male_avatar_round, getString(R.string.r_post_time_03))
        addToList(getString(R.string.r_user_name_04), getString(R.string.r_user_quote_04), R.mipmap.female_avatar_round, getString(R.string.r_post_time_04))
        addToList(getString(R.string.r_user_name_05), getString(R.string.r_user_quote_05), R.mipmap.male_avatar_round, getString(R.string.r_post_time_05))

        for (i in 7..30) {
            addToList(getString(R.string.r_user_name) + "$i", getString(R.string.r_user_quote) + "$i", R.mipmap.random_round, getString(R.string.r_post_time))
        }

    }
}