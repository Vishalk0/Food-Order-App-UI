package com.example.vegfoodorder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vegfoodorder.databinding.FragmentNotificationButtonBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class notification_Button_Fragment : BottomSheetDialogFragment() {

    private lateinit var binding:FragmentNotificationButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val notification= listOf("order has been canceled sucessfully","Order has be confirm","Congratulation")
        val 
        binding=FragmentNotificationButtonBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {


    }
}