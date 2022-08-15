package com.example.animations

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityTranslationsAndScaleBinding

class TranslationsAndScaleActivity : AppCompatActivity() {

    lateinit var binding: ActivityTranslationsAndScaleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslationsAndScaleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonGoBack.setOnClickListener {
            startActivity(Intent(this, AnimationsMenuActivity::class.java))
            finish()
        }

        binding.buttonTranslationInX.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "translationX", 0f, 100f,-200f, 0f).apply {
                duration = 2000
                start()
            }
        }

        binding.buttonTranslationInY.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "translationY", 0f, 100f, -200f, 0f).apply {
                duration = 2000
                start()
            }
        }

        binding.buttonZoomIn.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "scaleY", 1f, 2f).apply {
                duration = 2000
                start()
            }
        }

        binding.buttonZoomOut.setOnClickListener {
            ObjectAnimator.ofFloat(binding.imageView, "scaleY", 2f, 1f).apply {
                duration = 2000
                start()
            }
        }
    }
}