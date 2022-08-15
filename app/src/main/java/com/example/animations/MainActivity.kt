package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAnimations.setOnClickListener {
            startActivity(Intent(this, AnimationsMenuActivity::class.java))
            finish()
        }
        binding.buttonTransitions.setOnClickListener {
            startActivity(Intent(this, TransitionsMenuActivity::class.java))
        }
    }
}