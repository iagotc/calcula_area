package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quadrado2.*

class Quadrado2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quadrado2)

        val intent = intent
        val name = intent.getStringExtra(  "Name")
        val email = intent.getStringExtra( "Email")

        val area = Integer.parseInt(name) * Integer.parseInt(email)


        val resultTV = findViewById<TextView>(R.id.resultTv)
        resultTV.text = "Area: "+area+"cm²"

        buttonci.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
