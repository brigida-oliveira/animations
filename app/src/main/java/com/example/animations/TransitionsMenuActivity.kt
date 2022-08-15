package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animations.databinding.ActivityTransitionsMenuBinding

class TransitionsMenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityTransitionsMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransitionsMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButtonGoBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        binding.buttonZoomInTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation)
            finish()
        }

        binding.buttonZoomOutTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.zoom_out, R.anim.static_animation)
            finish()
        }

        binding.buttonSlideToTopTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.slide_from_bottom,R.anim.slide_to_top)
            finish()
        }

        binding.buttonSlideToBottomTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.slide_from_top,R.anim.slide_to_bottom)
            finish()
        }

        binding.buttonSlideToRightTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
            finish()
        }

        binding.buttonSlideToLeftTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(R.anim.rotate,R.anim.static_animation)
            finish()
        }

        binding.buttonFadeTransition.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}
