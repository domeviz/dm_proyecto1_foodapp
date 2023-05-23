package com.example.dm_proyecto1_foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton1=findViewById<Button>(R.id.boton1)
        var texto=findViewById<TextView>(R.id.editTextText)
        boton1.text="INGRESAR"
        boton1.setOnClickListener{
            texto.text="El evento se ha ejecutado"
            Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show()
            Snackbar.make(boton1, "Este es otro mensaje", Snackbar.LENGTH_SHORT)
                .show()
        }
    }
}