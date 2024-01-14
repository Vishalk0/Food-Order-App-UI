package com.example.vegfoodorder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegfoodorder.databinding.CartItemBinding

class CartAdapter(private val cartItem:MutableList<String>,private val CardItemprice:MutableList<String>,private val Cartitemimage:MutableList<Int>):
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {


        private val ItemQuentity=IntArray(cartItem.size){1}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding=CartItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
      holder.bind(position)
    }
    override fun getItemCount(): Int {
        return cartItem.size
    }
    inner class CartViewHolder( private val binding: CartItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {

            binding.apply {val quentity=ItemQuentity[position]
                cartfoodname.text=cartItem[position]
               cartitemprice.text=CardItemprice[position]
                cartimageitem.setImageResource(Cartitemimage[position])

                cartquentity.text=quentity.toString()

                minusbutton.setOnClickListener{

                    decreaseQuentity(position)
                }
                plushbutton.setOnClickListener {

                    increaseQuentity(position)
                }
                deletebutton.setOnClickListener {

                    val itemPosition=adapterPosition
                    if (itemPosition !=RecyclerView.NO_POSITION){
                        deleteQuentity(itemPosition)
                    }
                }
            }
        }
      private  fun decreaseQuentity(position: Int){
          if (ItemQuentity[position]>1)
                ItemQuentity[position]--
            binding.cartquentity.text=ItemQuentity[position].toString()
        }
     private  fun increaseQuentity(position: Int){

                ItemQuentity[position]++
            binding.cartquentity.text=ItemQuentity[position].toString()
         notifyItemChanged(position)
        }
      private fun deleteQuentity(position: Int){
            cartItem.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,cartItem.size)
        }


    }

}