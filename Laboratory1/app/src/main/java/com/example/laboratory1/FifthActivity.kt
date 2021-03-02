package com.example.laboratory1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.recycleView.RecycleAdapter
import java.text.SimpleDateFormat
import java.util.*

class FifthActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    private var timeList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        postToList()

        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecycleAdapter(titleList, descriptionList, imagesList, timeList)
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
//        val myAvatar = intent.getIntExtra("myAvatar", 0)

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