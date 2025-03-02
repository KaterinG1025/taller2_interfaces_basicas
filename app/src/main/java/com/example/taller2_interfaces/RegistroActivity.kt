package com.example.taller2_interfaces;

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    private lateinit var editTextNombres: EditText
    private lateinit var editTextApellidos: EditText
    private lateinit var buttonRegistro: Button
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        Log.d("RegistroActivity", "onCreate: Registro Activity Iniciando")

        //Inicializar las variables
        sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE)

        //Inicializar variables de vista
        editTextNombres = findViewById(R.id.editTextNombres)
        editTextApellidos = findViewById(R.id.editTextApellidos)
        buttonRegistro = findViewById(R.id.buttonRegistro)

        //Configuracion listener boton de registro

        buttonRegistro.setOnClickListener {
            if (validarCampos()){
                //metodo de guardar datos de usuario
                guardarDatosUsuario()
                //redireccionamiento
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun validarCampos(): Boolean{
        val nombres = editTextNombres.text.toString().trim()

        if (nombres.isEmpty()){
            Toast.makeText(this,"El campo de Nombres es obligatorio",Toast.LENGTH_SHORT).show()
            //mostrar mensaje
            return false
        }
        return true
    }

    private fun guardarDatosUsuario(){
        val editor = sharedPreferences.edit()
        editor.putString("nombre",editTextNombres.text.toString().trim())
        editor.apply()
        Log.d("Registro Activity", "guardarDatosUsuario: Datos del usuario guardados")
        Toast.makeText(this,"Registro exitoso",Toast.LENGTH_SHORT).show()
    }

}