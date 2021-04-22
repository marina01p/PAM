package com.example.laboratory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laboratory1.data.api.ApiHelper
import com.example.laboratory1.data.api.RetrofitBuilder
import com.example.laboratory1.data.model.Posts
import com.example.laboratory1.data.model.User
import com.example.laboratory1.ui.base.ViewModelFactory
import com.example.laboratory1.ui.base.ViewModelFactory1
import com.example.laboratory1.ui.main.adapter.MainAdapter
import com.example.laboratory1.ui.main.adapter.PostsAdapter
import com.example.laboratory1.ui.main.viewmodel.MainViewModel
import com.example.laboratory1.ui.main.viewmodel.PostsViewModel
import com.example.laboratory1.utils.Status
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_sixth.*

class SixthActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var viewModel1: PostsViewModel
    private lateinit var adapter: MainAdapter
    private lateinit var adapter1: PostsAdapter

    lateinit var bottomNavigation : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        setupViewModel()
        setupViewModel1()
        setupUI()
        setupUI1()
        setupObservers()
        setupObservers1()

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.selectedItemId = R.id.users
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

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper(RetrofitBuilder.apiService))
        ).get(MainViewModel::class.java)
    }

    private fun setupViewModel1() {
        viewModel1 = ViewModelProviders.of(
                this,
                ViewModelFactory1(ApiHelper(RetrofitBuilder.apiService))
        ).get(PostsViewModel::class.java)
    }

    private fun setupUI() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(arrayListOf())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter
    }

    private fun setupUI1() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter1 = PostsAdapter(arrayListOf())
        recyclerView.addItemDecoration(
                DividerItemDecoration(
                        recyclerView.context,
                        (recyclerView.layoutManager as LinearLayoutManager).orientation
                )
        )
        recyclerView.adapter = adapter
    }

    private fun setupObservers() {
        viewModel.getUsers().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        resource.data?.let { users -> retrieveList(users) }
                    }
                    Status.ERROR -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        recyclerView.visibility = View.GONE
                    }
                }
            }
        })
    }

    private fun setupObservers1() {
        viewModel1.getPosts().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        resource.data?.let { posts -> retrieveList1(posts) }
                    }
                    Status.ERROR -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        recyclerView.visibility = View.GONE
                    }
                }
            }
        })
    }

    private fun retrieveList(users: List<User>) {
        adapter.apply {
            addUsers(users)
            notifyDataSetChanged()
        }
    }

    private fun retrieveList1(posts: List<Posts>) {
        adapter1.apply {
            addPosts(posts)
            notifyDataSetChanged()
        }
    }
}