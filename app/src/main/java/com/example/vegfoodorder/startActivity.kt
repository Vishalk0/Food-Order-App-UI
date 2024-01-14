package com.example.vegfoodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.vegfoodorder.databinding.ActivityMainBinding
import com.example.vegfoodorder.databinding.ActivityStartBinding

class startActivity : AppCompatActivity() {
    private val binding:ActivityStartBinding by lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.nextbtn.setOnClickListener{

            startActivity(Intent(this,loginActivity::class.java))
        }

    }
}