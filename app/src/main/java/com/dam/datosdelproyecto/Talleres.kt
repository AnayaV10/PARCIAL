package com.dam.datosdelproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Talleres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talleres)

        val btntalleres: Button = findViewById(R.id.VolverTalleresInicio)
        btntalleres.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}