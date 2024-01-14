package com.example.vegfoodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class splaceactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splaceactivity)
        Handler(Looper.getMainLooper()).postDelayed({
startActivity(Intent(this,startActivity::class.java))
        },3000)
    }
}