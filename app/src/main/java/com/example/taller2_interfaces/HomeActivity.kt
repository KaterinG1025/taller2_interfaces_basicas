package com.example.taller2_interfaces

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun gotToLogin(view: View?) {
        startActivity(
            Intent(this, LoginActivity::class.java).apply {
                Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
        );
        finish();
    };
}