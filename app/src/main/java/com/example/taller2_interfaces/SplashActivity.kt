package com.example.taller2_interfaces

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.d("SplashActivity", "onCreate: Iniciando Activity Splash")

        //Configurar el temporizador de redireccion a Home Activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        },SPLASH_TIME_OUT)
        // Llevar a MainActivity
//        Handler(mainLooper).postDelayed({
//            startActivity(
//                Intent(this, HomeActivity::class.java).apply {
//                    Intent.FLAG_ACTIVITY_SINGLE_TOP
//                }
//            );
//            finish();
//        }, SPLASH_TIME_OUT);
    }
    override fun onStart() {
        super.onStart()
        Log.d("SplashActivity", "onStart: Activity Splash está en primer plano")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SplashActivity", "onPause: Activity Splash está en pausa")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SplashActivity", "onStop: Activity Splash ha sido detenida")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SplashActivity", "onDestroy: Activity Splash ha sido destruida")
    }
}