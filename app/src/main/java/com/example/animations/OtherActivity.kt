package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    lateinit var binding: ActivityOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonGoBack.setOnClickListener {
            startActivity(Intent(this, TransitionsMenuActivity::class.java))
        }
    }
}