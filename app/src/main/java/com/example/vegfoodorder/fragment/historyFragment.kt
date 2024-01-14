package com.example.vegfoodorder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vegfoodorder.R
import com.example.vegfoodorder.adapter.BuyAgainAdapter
import com.example.vegfoodorder.databinding.FragmentHistoryBinding


class historyFragment : Fragment() {

private lateinit var binding:FragmentHistoryBinding
private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentHistoryBinding.inflate(layoutInflater,container,false)
        setUpRecyclevView()
        return binding.root
    }
    private fun setUpRecyclevView(){
        val buyAgainFoodName= arrayListOf("Food1","Food2","Food3")
        val buyAgainFoodPrice= arrayListOf("$7","$2","$3")
         val buyAgainFoodImage= arrayListOf(R.drawable.food1,R.drawable.food3,R.drawable.food2)
        buyAgainAdapter= BuyAgainAdapter(buyAgainFoodName,buyAgainFoodPrice,buyAgainFoodImage)
        binding.buyAgainRecyclerView.adapter=buyAgainAdapter
        binding.buyAgainRecyclerView.layoutManager=LinearLayoutManager(requireContext())
    }

    companion object {

            }
    }

