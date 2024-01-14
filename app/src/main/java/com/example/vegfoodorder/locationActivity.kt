package com.example.vegfoodorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.vegfoodorder.databinding.ActivityLocationBinding

class locationActivity : AppCompatActivity() {
    private val binding:ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val loctionList= arrayOf("Gomtinagar","Veenit khand","huseriya","Hanumen")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,loctionList)
        val autoCompleteTextView=binding.location
        autoCompleteTextView.setAdapter(adapter)
    }
}