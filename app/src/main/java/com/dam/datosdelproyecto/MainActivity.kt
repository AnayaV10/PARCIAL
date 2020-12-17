package com.dam.datosdelproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: ImageButton = findViewById(R.id.Button1_Inscripcion)
        btn1.setOnClickListener{
            val intent : Intent = Intent(this,Inscripcion::class.java)
            startActivity(intent)
        }

        val btn2: ImageButton = findViewById(R.id.Button2_Talleres)
        btn2.setOnClickListener{
            val intent : Intent = Intent(this,Talleres::class.java)
            startActivity(intent)
        }
        val btn3: ImageButton = findViewById(R.id.Button3_Reglamento)
        btn3.setOnClickListener{
            val intent : Intent = Intent(this,Reglamento::class.java)
            startActivity(intent)
        }
    }
}