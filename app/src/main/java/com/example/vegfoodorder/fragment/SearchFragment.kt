package com.example.vegfoodorder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vegfoodorder.R
import com.example.vegfoodorder.adapter.MenuAdapter
import com.example.vegfoodorder.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
private lateinit var binding: FragmentSearchBinding
private lateinit var adapter:MenuAdapter
private val orignalFoodMenu= listOf("beger","panir","Samosa","Choklet","Icecream","coffee")
  private  val orignalMenuprice= listOf("$5","$7","$8","$9","$5","$7")
private val orignalMenuImage= listOf(R.drawable.food1,R.drawable.samosa,R.drawable.choklate,
    R.drawable.food1,R.drawable.food2,R.drawable.food3)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val filterMenuFoodName= mutableListOf<String>()
    private val filterMenuItemPrice= mutableListOf<String>()
    private val filterMenuImage= mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSearchBinding.inflate(inflater,container,false)
adapter= MenuAdapter(filterMenuFoodName,filterMenuItemPrice,filterMenuImage)
        binding.MenuRecyleView.layoutManager=LinearLayoutManager(requireContext())
        binding.MenuRecyleView.adapter=adapter

        //set for search view
        setupSearchView()
        //show all menu item in search
        showAllMenu()
        return binding.root

    }

    private fun showAllMenu() {
        filterMenuFoodName.clear()
        filterMenuItemPrice.clear()
        filterMenuImage.clear()
        filterMenuFoodName.addAll(orignalFoodMenu)
        filterMenuItemPrice.addAll(orignalMenuprice)
        filterMenuImage.addAll(orignalMenuImage)
    adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object :OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItems(newText)
                return true
            }

            private fun filterMenuItems(query: String) {
               filterMenuFoodName.clear()
               filterMenuItemPrice.clear()
               filterMenuImage.clear()

                orignalFoodMenu.forEachIndexed { index, foodName ->
                    if (foodName.contains(query,ignoreCase = true)){
                        filterMenuFoodName.add(foodName)
                        filterMenuItemPrice.add(orignalMenuprice[index])
                        filterMenuImage.add(orignalMenuImage[index])
                    }
                }
                adapter.notifyDataSetChanged()
            }

        })
    }

    companion object{

    }
}