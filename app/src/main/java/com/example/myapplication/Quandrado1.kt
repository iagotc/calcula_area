package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_circulo1.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quandrado1.*

class Quandrado1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quandrado1)

        val nameEt = findViewById<EditText>(R.id.nameET)
        val emailEt = findViewById<EditText>(R.id.emailET)
        val saveBtn = findViewById<Button>(R.id.sabeBtn)

        saveBtn.setOnClickListener {
            val name = nameEt.text.toString()
            val email = emailEt.text.toString()


            val intent = Intent(this@Quandrado1,Quadrado2::class.java)

            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            startActivity(intent)
        }



        }





}
