package com.example.vegfoodorder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegfoodorder.databinding.NotificationItemBinding

class NotificationAdapter(private var notificationName :Array<String>,private var notificationImagePlace:Array<Int>):RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val binding=NotificationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NotificationViewHolder(binding)
    }



    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
       holder.bind(position)
    }
    override fun getItemCount(): Int{
        return notificationName.size
    }

    class NotificationViewHolder(private val binding:NotificationItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {

            binding.apply {

//                notificationTextview.text = notificationName[position]
//                notificationItemImage.setImageResource(notificationImage[position])
            }

        }

    }
}


