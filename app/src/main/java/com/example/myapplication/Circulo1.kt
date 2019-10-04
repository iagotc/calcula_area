package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import kotlinx.android.synthetic.main.activity_circulo1.*
import kotlinx.android.synthetic.main.activity_main.*

class Circulo1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo1)

        val nameEt = findViewById<EditText>(R.id.nameET)

        val saveBtn = findViewById<Button>(R.id.sabeBtn)

        saveBtn.setOnClickListener {
            val name = nameEt.text.toString()

            val intent = Intent(this@Circulo1,Circulo2::class.java)

            intent.putExtra("Name", name)
            startActivity(intent)
        }





    }


}
