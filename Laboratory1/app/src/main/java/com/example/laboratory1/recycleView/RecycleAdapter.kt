package com.example.laboratory1.recycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratory1.R

class RecycleAdapter(private var titles: List<String>,
                     private var details: List<String>,
                     private var images: List<Int>,
                     private var time: List<String>):

        RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView) {

        val itemTitle: TextView = itemView.findViewById(R.id.thisTitle)
        val itemDetails: TextView = itemView.findViewById(R.id.thisDescription)
        val itemPicture: ImageView = itemView.findViewById(R.id.thisImage)
        val itemTime: TextView = itemView.findViewById(R.id.postTime)

        init {
            itemView.setOnClickListener {
                v: View -> Toast.makeText(itemView.context, "You clicked on item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetails.text = details[position]
        holder.itemPicture.setImageResource(images[position])
        holder.itemTime.text = time[position]
    }
}