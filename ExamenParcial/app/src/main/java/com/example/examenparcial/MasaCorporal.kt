package com.example.examenparcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MasaCorporal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_masa_corporal)
        calcularIcm()
        regresarmasa()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    private fun calcularIcm(){
        val btncalcularicm = findViewById<Button>(R.id.btn_calcularicm)
        val tv_peso = findViewById<TextView>(R.id.imp_pesoicm)
        val tv_altura = findViewById<TextView>(R.id.imp_alturaicm)
        var txt_numeroicm = findViewById<TextView>(R.id.txt_numeroicm)
        var txt_resultadoicm = findViewById<TextView>(R.id.txt_resultadoicm)



        btncalcularicm.setOnClickListener {
            val peso = tv_peso.text.toString().toDouble()
            val altura = tv_altura.text.toString().toDouble()
            val resultado = peso / (altura * altura)

            val categoria = when {
                resultado < 18.5 -> "Bajo Peso"
                resultado >= 18.5 && resultado < 24.9 -> "Normal"
                resultado >= 25 && resultado < 29.9 -> "Sobrepeso"
                resultado >= 30 -> "Obesidad"
                else -> "Valor inválido"
            }

            txt_numeroicm.text = String.format("%.1f", resultado)
            txt_resultadoicm.text = categoria
        }
    }


    fun regresarmasa(){
        val regresarmasa = findViewById<Button>(R.id.btn_regresaricm)
        regresarmasa.setOnClickListener(){
            val saltarVentana: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltarVentana)
        }
    }
}