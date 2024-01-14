package com.example.vegfoodorder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vegfoodorder.adapter.MenuAdapter
import com.example.vegfoodorder.databinding.FragmentMenuBottonSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottonSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottonSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding=FragmentMenuBottonSheetBinding.inflate(inflater,container,false)
        binding.backbutton.setOnClickListener {
            dismiss()
        }
        val menufoodname= listOf("beger","panir","samosa","chocklate","coffee","panir")
        val menuprice= listOf("$5","$7","$8","$9","$5","$7")
        val menuitemimage=listOf(R.drawable.food1,R.drawable.food2,R.drawable.samosa,R.drawable.choklate,R.drawable.food1,R.drawable.food3)
        val adapter=MenuAdapter(
            ArrayList(menufoodname),
            ArrayList(menuprice),
            ArrayList(menuitemimage)
        )
        binding.MenuRecycleview.layoutManager=LinearLayoutManager(requireContext())
        binding.MenuRecycleview.adapter=adapter
        return binding.root
    }

    companion object {

    }
}