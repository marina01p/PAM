package com.example.laboratory1.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.R
import com.example.laboratory1.data.model.Posts
import kotlinx.android.synthetic.main.item_layout_one.view.*

class PostsAdapter(private val posts: ArrayList<Posts>) : RecyclerView.Adapter<PostsAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(posts: Posts) {
            itemView.apply {
                textViewPostTitle.text = posts.title
                textViewPostBody.text = posts.body
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
            DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_one, parent, false))

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    fun addPosts(posts: List<Posts>) {
        this.posts.apply {
            clear()
            addAll(posts)
        }
    }
}