package com.example.app_sencilla

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Con esto tendremos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        //Creamos una variable para que guarde el intent que hemos recuperado con la informacion
        val saludo = intent.getStringExtra("NOMBRE")

        //Construimos el mensaje que se mostra al final de la aplicación
        txtSaludo.text = "Información[ $saludo]"


    }
}