package com.asgar72.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class MyAdapter(var newsArrayList: ArrayList<News>, var context : Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var myListener: onItemClickListener
    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        myListener =  listener
    }

    // to create new view instance
    // when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return  MyViewHolder(itemView,myListener)
    }

    // populate item with data
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int){
        var currentItem  = newsArrayList[position]
        holder.hTittle.text = currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImage)
    }
    //how many list item is present in your array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }


    // it holds the view so views are not created everytime, so memory can be saved
    class MyViewHolder(itemView: View, listener : onItemClickListener) : RecyclerView.ViewHolder(itemView){
        val hTittle = itemView.findViewById<TextView>(R.id.tVHeading)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.imgNews)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

}