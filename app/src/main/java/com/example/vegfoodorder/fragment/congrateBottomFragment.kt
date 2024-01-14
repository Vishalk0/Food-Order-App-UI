package com.example.vegfoodorder.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vegfoodorder.MainActivity
import com.example.vegfoodorder.R
import com.example.vegfoodorder.databinding.FragmentCongrateBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class congrateBottomFragment :BottomSheetDialogFragment() {
private lateinit var binding:FragmentCongrateBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCongrateBottomBinding.inflate(layoutInflater,container,false)
        binding.gohomebtn.setOnClickListener {
            val intent=Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)

        }
        return binding.root
    }

    companion object {

    }
}