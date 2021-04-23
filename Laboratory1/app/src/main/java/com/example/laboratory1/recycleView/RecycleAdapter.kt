package com.example.laboratory1.recycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.databinding.ItemLayoutBinding

class RecycleAdapter(private var titles: List<String>,
                     private var details: List<String>,
                     private var images: List<Int>,
                     private var time: List<String>):

        RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private var _binding: ItemLayoutBinding? = null
    private val binding get() = _binding!!

    inner class ViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView) {
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

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        binding.thisTitle.text = titles[position]
        binding.thisDescription.text = details[position]
        binding.thisImage.setImageResource(images[position])
        binding.postTime.text = time[position]
    }
}
