package com.example.thaitravelguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter (val  imageList: List<Int>)
    :RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image : ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewPagerViewHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val list = imageList[position]
        holder.image.setImageResource(list)
    }

}