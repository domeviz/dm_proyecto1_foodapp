package com.example.dm_proyecto1_foodapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dm_proyecto1_foodapp.R
import com.example.dm_proyecto1_foodapp.databinding.ActivityMainBinding
import com.example.dm_proyecto1_foodapp.databinding.ActivityNuevaBinding
import com.google.android.material.snackbar.Snackbar

class NuevaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNuevaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNuevaBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        initClass()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        binding.botoncito.setOnClickListener {
            var f = Snackbar.make(
                binding.botoncito,
                "Mensaje",
                Snackbar.LENGTH_SHORT
            )
            f.show()
        }
    }
}
