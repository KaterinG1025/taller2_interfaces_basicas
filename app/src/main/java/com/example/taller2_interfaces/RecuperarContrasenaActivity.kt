package com.example.taller2_interfaces

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns


class RecuperarContrasenaActivity : AppCompatActivity(){

    private lateinit var ediTextCorreo : EditText
    private lateinit var buttonEnviar: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacion_contrasena)

        sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE)

        //Inicializando variables generales
        ediTextCorreo = findViewById(R.id.editTextEmail)
        buttonEnviar = findViewById(R.id.buttonRecuperacion)

        //Configurar el boton de envio
        buttonEnviar.setOnClickListener{
            if(validarCorreo()){
                //Verifiacion del correo electronico
            }
        }
    }
    private fun validarCorreo(): Boolean {
        val correo = ediTextCorreo.text.toString().trim()
        if (correo.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
            ediTextCorreo.error = "Correo electrónico inválido"
            return false
        }
        return true
    }

    private fun verificarCorreo(){
        val correo = ediTextCorreo.text.toString().trim()
        val correoRegistrado = sharedPreferences.getString("correo","")

        if (correo == correoRegistrado){
            Log.d("Recuperar Contraseña", "verificarCorreo: Verificar el correo del usuario que este correctamente")

            buttonEnviar.postDelayed({
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            },1500)
        }else{
            //Mostrar mensaje de error
            //log.d
        }
    }
}