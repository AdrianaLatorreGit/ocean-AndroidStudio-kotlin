package com.oceanbrasil.ocean_android_introducao_30_06_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //Pegamos a intent que originou essa tela e extraímos a informação extra que foi adicionada

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        tvResultado.text = nomeDigitado

        //Voltar

        val btVoltar = findViewById<Button>(R.id.btVoltar)

        btVoltar.setOnClickListener {
            finish()
        }
    }
}