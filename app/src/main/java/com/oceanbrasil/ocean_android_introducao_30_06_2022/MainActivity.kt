package com.oceanbrasil.ocean_android_introducao_30_06_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buscar o botão pelo ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btEnviar.setOnClickListener {
            //Dentro deste bloco, estamos dentro do clickListener
            //Portanto, o código que está aqui será executado
            //quando o botão for clicado (clique = toque no celular)

            tvResultado.text = "Adriana Latorre"
        }
    }
}