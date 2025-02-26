package com.example.taller2_interfaces

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Llevar a MainActivity
        Handler(mainLooper).postDelayed({
            startActivity(
                Intent(this, HomeActivity::class.java).apply {
                    Intent.FLAG_ACTIVITY_SINGLE_TOP
                }
            );
            finish();
        }, SPLASH_TIME_OUT);
    }
}