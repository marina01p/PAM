package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.databinding.ActivityFifthBinding
import com.example.laboratory1.posts.Posts
import com.example.laboratory1.posts.RecycleAdapter
import com.example.laboratory1.posts.model.PostModel
import com.example.laboratory1.posts.presenter.PostPresenter
import com.example.laboratory1.posts.view.PostView
import com.example.laboratory1.utils.AppConstants
import com.example.laboratory1.utils.AppConstants.postsPresenter
import com.example.laboratory1.utils.AppConstants.recyclerAdapter
import java.util.*

class FifthActivity : AppCompatActivity(), PostView {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        postsPresenter = PostPresenter(this, PostModel())
        postsPresenter.sendPosts()
    }

    override fun postsView(postsList: ArrayList<Posts>) {
        postsPresenter = PostPresenter(this, PostModel())

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerAdapter = RecycleAdapter(postsList)

        val layoutManager = GridLayoutManager(applicationContext, 1);
        recyclerView.layoutManager = layoutManager

        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = recyclerAdapter
        recyclerView.adapter?.notifyDataSetChanged()

        AppConstants.bottomNavigation = findViewById(R.id.bottom_navigation)

        AppConstants.bottomNavigation.selectedItemId = R.id.posts
        AppConstants.bottomNavigation.performClick()

        AppConstants.bottomNavigation.setOnNavigationItemSelectedListener { item ->
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