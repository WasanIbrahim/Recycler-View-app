package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter(private val colors: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false //don't attach to root
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val color = colors[position] //access to each item in list

        holder.itemView.apply {
            //changing each view

            tvColor.text = color
        }
    }

    override fun getItemCount() = colors.size //return the count of the list
}