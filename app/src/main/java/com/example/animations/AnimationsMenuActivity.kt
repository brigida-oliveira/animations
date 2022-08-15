package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityAnimationsMenuBinding

class AnimationsMenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityAnimationsMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationsMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonGoBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        binding.buttonRotationsAndFade.setOnClickListener {
            startActivity(Intent(this, RotationsAndFadeActivity::class.java))
            finish()
        }
        binding.buttonTranslateAndZoom.setOnClickListener {
            startActivity(Intent(this, TranslationsAndScaleActivity::class.java))
            finish()
        }
    }
}