package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonq.setOnClickListener {

            val intent = Intent(this, Quandrado1::class.java)
            startActivity(intent)

        }

        buttont.setOnClickListener {

            val intent = Intent(this, Triangulo1::class.java)
            startActivity(intent)

        }

        buttonc.setOnClickListener {

            val intent = Intent(this, Circulo1::class.java)
            startActivity(intent)

        }
    }


}
