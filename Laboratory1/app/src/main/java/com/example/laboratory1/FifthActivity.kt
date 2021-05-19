package com.example.laboratory1

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


    }
}