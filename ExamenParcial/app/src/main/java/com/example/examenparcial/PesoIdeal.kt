package com.example.examenparcial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PesoIdeal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_peso_ideal)
        regresarpeso()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun calcularPeso(){
        val btncalculapeso = findViewById<Button>(R.id.btn_calcularpeso)
        val tv_mujer = findViewById<TextView>(R.id.radiomuj)
        val tv_hombre = findViewById<TextView>(R.id.radiohom)
        val tv_alturapeso = findViewById<TextView>(R.id.imp_alturapeso)
        var txt_numeropeso = findViewById<TextView>(R.id.txt_numeropeso)
        var txt_resultadopeso = findViewById<TextView>(R.id.txt_resultadopeso)

        btncalculapeso.setOnClickListener {
            val altura = tv_alturapeso.text.toString().toDouble()


        }

    }




    fun regresarpeso(){
        val regresarpeso = findViewById<Button>(R.id.btn_regresaricm)
        regresarpeso.setOnClickListener(){
            val saltarVentana: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltarVentana)
        }
    }
}