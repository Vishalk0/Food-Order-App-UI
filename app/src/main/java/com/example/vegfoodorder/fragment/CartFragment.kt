package com.example.vegfoodorder.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vegfoodorder.R
import com.example.vegfoodorder.adapter.CartAdapter
import com.example.vegfoodorder.databinding.FoodItemBinding
import com.example.vegfoodorder.databinding.FragmentCartBinding
import com.example.vegfoodorder.databinding.FragmentHome2Binding
import com.example.vegfoodorder.payOutActivity


class CartFragment : Fragment() {
private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentCartBinding.inflate(inflater,container,false)

        val cartFoodName= listOf("Burguer","Panir","samosa","coffee")
        val cartItemPrice=listOf("$5","$6","$8","$9")
        val cartImage= listOf(R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food,R.drawable.food1)
        val adapter=CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecycleView.layoutManager=LinearLayoutManager(requireContext())
        binding.cartRecycleView.adapter=adapter
       binding.proceedbtn.setOnClickListener {
           val intent=Intent(requireContext(),payOutActivity::class.java)
           startActivity(intent)
       }
        return binding.root

    }

    companion object {

    }
}