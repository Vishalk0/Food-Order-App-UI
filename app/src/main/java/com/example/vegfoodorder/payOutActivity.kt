package com.example.vegfoodorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.vegfoodorder.databinding.ActivityPayOutBinding
import com.example.vegfoodorder.fragment.congrateBottomFragment

class payOutActivity : AppCompatActivity() {
    private  val binding:ActivityPayOutBinding by lazy {
        ActivityPayOutBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
binding.placeorderbtn.setOnClickListener {
    val bottomSheetDialog= congrateBottomFragment
}
    }
}