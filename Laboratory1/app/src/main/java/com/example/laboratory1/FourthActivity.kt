package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.feed.FeedItem
import com.example.laboratory1.feed.FeedRecyclerViewAdapter

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val btn = findViewById<Button>(R.id.button)
        val recyclerView = findViewById<RecyclerView>(R.id.feed_recycler_view)

        btn.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val viewManager = LinearLayoutManager(this)

        val viewAdapter = FeedRecyclerViewAdapter(Array(30) {

            FeedItem(
                "Hey",
                "Some description"
            )
        })

        recyclerView.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}