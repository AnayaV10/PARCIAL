package com.dam.datosdelproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Reglamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reglamento)

        val btn = findViewById<Button>(R.id.buttonVolver)

        btn?.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        val arrayAdapter: ArrayAdapter<*>
        val personas = mutableListOf ( "Conectarse a la hora indicada.",
            "Ingresar con el micrófono apagado.",
            "Se recomienda ingresar con la cámara encendida para una mayor interacción.",
            "Registre su asistencia.",
            "Usted puede grabar la conferencia.",
            "Tome apuntes.",
            "Ante una duda, use los iconos respectivos o pida la palabra.")

        val listviewDatos = findViewById<ListView>(R.id.listReglas)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, personas)
        listviewDatos.adapter = arrayAdapter

        listviewDatos.setOnItemClickListener(){ parent, view, position, id->
            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()

        }
    }
}