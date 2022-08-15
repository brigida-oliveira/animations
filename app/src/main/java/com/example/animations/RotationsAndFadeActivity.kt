package com.example.animations

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityRotationsAndFadeBinding

class RotationsAndFadeActivity : AppCompatActivity() {

    lateinit var binding: ActivityRotationsAndFadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRotationsAndFadeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonGoBack.setOnClickListener {
            startActivity(Intent(this, AnimationsMenuActivity::class.java))
            finish()
        }

        binding.buttonRotationInX.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "rotationX", 0f, 360f, 0f).apply {
                duration = 1500
                start()
            }
        }

        binding.buttonRotationInY.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "rotationY", 0f, 360f).apply {
                duration = 1500
                start()
            }
        }

        binding.buttonFadeOut.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "alpha", 1.0f, 0f).apply {
                duration = 1500
                start()
            }
        }

        binding.buttonFadeIn.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "alpha", 0f, 1f).apply {
                duration = 1500
                start()
            }
        }
    }
}