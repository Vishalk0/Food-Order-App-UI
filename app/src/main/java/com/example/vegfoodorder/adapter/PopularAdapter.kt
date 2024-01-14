package com.example.vegfoodorder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegfoodorder.databinding.FoodItemBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>, private val image:List<Int>):RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
     return PopularViewHolder(FoodItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
val item=items[position]
val price=price[position]
        val image=image[position]
        holder.bind(item,price,image)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding:FoodItemBinding):RecyclerView.ViewHolder(binding.root){
        private val imageView=binding.imageView5
        fun bind(item: String, price: String,image: Int) {

            binding.foodnamepopular.text=item
            binding.pricepopular.text=price
            imageView.setImageResource(image)
        }

    }
}