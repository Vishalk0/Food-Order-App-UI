package com.example.vegfoodorder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.vegfoodorder.MenuBottonSheetFragment
import com.example.vegfoodorder.R
import com.example.vegfoodorder.adapter.PopularAdapter
import com.example.vegfoodorder.databinding.ActivityLoginBinding
import com.example.vegfoodorder.databinding.FragmentHome2Binding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHome2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHome2Binding.inflate(inflater, container, false)

        binding.viewallmenu.setOnClickListener{
            val bottomSheetDial=MenuBottonSheetFragment()
            bottomSheetDial.show(parentFragmentManager,"test")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner4, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                // Handle double click
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })

        val FoodName= listOf("Cakes","Panir","Salad","Samosa")

        val Price= listOf("$5","$7","$8","$7")
      val  poopularFoodImages= listOf(R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.samosa)
        val adapter=PopularAdapter(FoodName,Price,poopularFoodImages)
        binding.popularRecycleView.layoutManager=LinearLayoutManager(requireContext())
        binding.popularRecycleView.adapter=adapter
    }

    // Baaki functions jaise onCreate, companion object, etc. aap rakh sakte hain.
}
