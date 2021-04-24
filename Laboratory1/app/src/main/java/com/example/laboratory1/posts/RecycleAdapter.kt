package com.example.laboratory1.posts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.databinding.ItemLayoutBinding

internal class RecycleAdapter(private var postsList: List<Posts>) :
        RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private var _binding: ItemLayoutBinding? = null
    private val binding get() = _binding!!

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "You clicked on item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        _binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val view = binding.root
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val posts = postsList[position]

        binding.thisTitle.text = posts.titles
        binding.thisDescription.text = posts.details
        binding.thisImage.setImageResource(posts.image!!)
        binding.postTime.text = posts.time
    }

    override fun getItemCount(): Int {
        return postsList.size
    }
}