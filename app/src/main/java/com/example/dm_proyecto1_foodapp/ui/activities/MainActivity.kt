package com.example.dm_proyecto1_foodapp.ui.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dm_proyecto1_foodapp.R
import com.example.dm_proyecto1_foodapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //    Binding
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        initClass()

//        //Binding: Infiere el tipo de la variable
//        var boton2=binding.boton1
//
//        //Binding
//        binding.boton1.setOnClickListener{
//            binding.txtBuscar.text="El codigo se ejecuta correctamente"
//        }
//
//        //Variables sin Binding
//        var boton1=findViewById<TextView>(R.id.boton1)
//        var texto=findViewById<TextView>(R.id.txtBuscar)
//
//        boton1.text="INGRESAR"
////        boton1.editableText.clear()
//        boton1.setOnClickListener{
//            texto.text="El evento se ha ejecutado"
//            Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show()
//            Snackbar.make(boton1, "Este es otro mensaje", Snackbar.LENGTH_SHORT)
//                .show()
    }

    override fun onStart() {
        super.onStart()
        initClass()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        binding.boton1.setOnClickListener {
            binding.txtBuscar.text = "El codigo se ejecuta correctamente"
            //SUMA
            var f = Snackbar.make(binding.boton1,
                "Este es otro mensaje",
                Snackbar.LENGTH_SHORT)
            f.show()
        }
    }
}