package com.example.dm_proyecto1_foodapp.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dm_proyecto1_foodapp.R
import com.example.dm_proyecto1_foodapp.databinding.ActivityMainBinding
import com.example.dm_proyecto1_foodapp.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("UCE","Entrando a Create")
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        var name:String=" "
        intent.extras.let{
            name=it?.getString("var1")!!
        }
        Log.d("UCE","Hola ${name}")
        binding.textView.text="Bienvenida "+name.toString()
        Log.d("UCE","Entrando a Start")
        binding.back.setOnClickListener{
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        initClass()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        binding.back.setOnClickListener {
            var intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}