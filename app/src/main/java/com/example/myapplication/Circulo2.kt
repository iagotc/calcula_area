package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quadrado2.*

class Circulo2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo2)


        val intent = intent
        val name = intent.getStringExtra("Name")


        val area =3.1416 * (Integer.parseInt(name) * Integer.parseInt(name))
        //corrigir conta


        val resultTV = findViewById<TextView>(R.id.resultTv)
        resultTV.text = "Area: " + area + "cm²"

        buttonci.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
