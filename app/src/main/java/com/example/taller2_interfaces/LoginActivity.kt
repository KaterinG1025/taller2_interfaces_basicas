package com.example.taller2_interfaces

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var textViewRegistrar: TextView
    private lateinit var textViewrecuperarContraseña: TextView
    private lateinit var buttonLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        textViewRegistrar= findViewById(R.id.textRegistrologin)
        textViewrecuperarContraseña = findViewById(R.id.textResetPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        textViewRegistrar.setOnClickListener{
            //redireccionamiento
            val intent = Intent(this,RegistroActivity::class.java)
            startActivity(intent)
            finish()
        }

        textViewrecuperarContraseña.setOnClickListener{
            //redireccionamiento
            val intent = Intent(this, RecuperarContrasenaActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonLogin.setOnClickListener{
                //redireccionamiento
                val intent = Intent(this,PerfilActivity::class.java)
                startActivity(intent)
                finish()
        }
    }
}