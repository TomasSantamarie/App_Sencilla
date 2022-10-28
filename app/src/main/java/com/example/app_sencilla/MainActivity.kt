package com.example.app_sencilla

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var txtApellido : EditText
    private lateinit var txtCorreo : EditText


    private lateinit var btnAceptar : Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Obtenemos las referencia que queremos a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido = findViewById(R.id.txtApellido)
        txtCorreo = findViewById(R.id.txtCorreo)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            //Creamos el Intent done ira la informacion
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades que en este caso sera nombre/apellido y correo

            intent.putExtra("NOMBRE", "Nombre: "+txtNombre.text.toString()+"   Apellido: "
                    + txtApellido.text.toString()+ "       Correo: "+txtCorreo.text.toString()+" ")

            //Iniciamos la nueva actividad con el itent ya crado
            startActivity(intent)
        }
    }
}