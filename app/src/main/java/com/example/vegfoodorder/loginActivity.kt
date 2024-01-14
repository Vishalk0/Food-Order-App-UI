package com.example.vegfoodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vegfoodorder.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginbtn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        binding.notaccount.setOnClickListener{
            startActivity(Intent(this,signinActivity::class.java))
        }
    }
}