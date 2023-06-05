package com.example.dm_proyecto1_foodapp.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dm_proyecto1_foodapp.R
import com.example.dm_proyecto1_foodapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//Capa de presentación
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        //Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        initClass()
        initService()
    }

    private fun initService() {
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        binding.boton1.setOnClickListener {
            var intent = Intent(
                this,
                PrincipalActivity::class.java
            )
            intent.putExtra("var1","Dome")
            intent.putExtra("var2",binding.txtBuscar.text.toString())
            startActivity(intent)
        }
    }

}