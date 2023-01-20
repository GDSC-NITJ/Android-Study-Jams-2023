package com.gdscnitj.myapplication.MemeRec

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gdscnitj.myapplication.R

class memeAdapter (private val memeList : Array<Int>): RecyclerView.Adapter<memeAdapter.Myviewholder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.meme_item,parent,false)

        return Myviewholder(itemView)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {


        val currentItem =memeList[position]
        holder.memeImage.setImageResource(currentItem)

    }

    override fun getItemCount(): Int {
        return memeList.size
    }

    class Myviewholder(itemView : View) : RecyclerView.ViewHolder(itemView){


        val memeImage: ImageView = itemView.findViewById(R.id.memeImage)

    }



}