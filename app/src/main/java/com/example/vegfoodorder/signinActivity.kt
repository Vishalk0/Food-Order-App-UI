package com.example.vegfoodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vegfoodorder.databinding.ActivitySigninBinding

class signinActivity : AppCompatActivity() {
    private val binding:ActivitySigninBinding by lazy {
        ActivitySigninBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.haveaccount.setOnClickListener{
            startActivity(Intent(this,loginActivity::class.java))
        }
    }
}