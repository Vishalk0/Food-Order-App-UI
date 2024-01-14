package com.example.vegfoodorder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegfoodorder.databinding.MenuItemBinding

class MenuAdapter(private val menuItemName: List<String>, private val menuItemPrice: List<String>, private val menuItemImage: List<Int>):RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
       val binding=MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MenuViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
       holder.bind(position)
    }
    override fun getItemCount(): Int {
        return menuItemName.size
    }

    inner class MenuViewHolder(private val binding:MenuItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
          binding.apply {
              menufoodname.text=menuItemName[position]
              menuprice.text=menuItemPrice[position]
              menuimage.setImageResource(menuItemImage[position])
          }
        }

    }
}