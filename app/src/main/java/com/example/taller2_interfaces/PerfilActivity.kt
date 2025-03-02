package com.example.taller2_interfaces

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity(){
    private lateinit var textViewNombre: TextView
    private lateinit var textViewApellido: TextView
    private lateinit var textViewCorreo: TextView
    private lateinit var textViewTelefono: TextView
    private lateinit var buttonEdit: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        Log.d("ProfileActivity", "onCreate: Iniciando Activity Profile")

        //Inicializar las variables
        sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE)

        textViewNombre = findViewById(R.id.tv_nombres)
        textViewApellido = findViewById(R.id.tv_apellidos)
        textViewCorreo = findViewById(R.id.tv_correo)
        textViewTelefono = findViewById(R.id.tv_telefono)
        buttonEdit = findViewById(R.id.btn_editar)

        buttonEdit.setOnClickListener{
            //Codigo para editar el perfil
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("ProfileActivity", "onStart: Activity Profile está en primer plano")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ProfileActivity", "onPause: Activity Profile está pausada")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ProfileActivity", "onStop: Activity Profile está detenido")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ProfileActivity", "onDestroy: Activity Profile está destruida")
    }

//    private fun ConsultarInfoUsuario() {
//        val nombres = sharedPreferences.getString("nombres","")
//        val apellidos = sharedPreferences.getString("apellidos","")
//        val correo = sharedPreferences.getString("correo","")
//        val telefono = sharedPreferences.getString("telefono","")
//
//        textViewNombres.setText(nombres)
//        textViewApellidos.setText(apellido)
//        textViewCorreo.setText(correo)
//        textViewTelefono.setText(telefono)
//    }
}

