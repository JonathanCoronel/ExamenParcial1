package com.example.examenparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ExamenParcial)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        navegarMasa()
        navegarPeso()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun navegarMasa(){
        val btnmasa = findViewById<Button>(R.id.btn_masacorp)
        btnmasa.setOnClickListener(){
            val saltarVentana: Intent = Intent(this, MasaCorporal::class.java)
            startActivity(saltarVentana)
        }
    }

    fun navegarPeso(){
        val btnpeso = findViewById<Button>(R.id.btn_pesoid)
        btnpeso.setOnClickListener(){
            val saltarVentana: Intent = Intent(this, PesoIdeal::class.java)
            startActivity(saltarVentana)
        }
    }
}