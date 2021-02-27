package com.example.laboratory1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.recycleView.RecycleAdapter

class FifthActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        postToList()

        val rv_recyclerView= findViewById<RecyclerView>(R.id.rv_recyclerView)

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecycleAdapter(titleList, descriptionList, imagesList)
    }

    private fun addToList(title: String, description: String, image: Int) {
        titleList.add(title)
        descriptionList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i in 1..25) {
            addToList("Title $i", "Description $i", R.mipmap.airplane_ic_launcher)
        }
    }
}