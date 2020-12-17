package com.dam.datosdelproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Inscripcion extends AppCompatActivity {

    //Inicializamos los componentes
    private EditText correo, dni, nombre, celular, ciudad, correoOpc;
    private RadioButton internet, universidad, tvMedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion);

        //Asignamos los valores a cada uno de los componentes de la interfaz de variables
        correo = (EditText) findViewById(R.id.editText_correo);
        dni = (EditText) findViewById(R.id.editText_Dni);
        nombre = (EditText) findViewById(R.id.editText_Nombre);
        celular = (EditText) findViewById(R.id.editText_Celular);
        ciudad = (EditText) findViewById(R.id.editText_Ciudad);
        correoOpc = (EditText) findViewById(R.id.editText_correoOpc);
        internet = (RadioButton) findViewById(R.id.radioButton_Internet);
        universidad = (RadioButton) findViewById(R.id.radioButton_Universidad);
        tvMedio = (RadioButton) findViewById(R.id.radioButton_TV);
    }

   //Definimos un metodo al presionar el boton
    public void Registrar(View view) {

        if (correo.getText().toString().isEmpty()) {
            Toast.makeText(this, "Campo correo institucional vacio", Toast.LENGTH_LONG).show();
        }else {
            if (dni.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo dni vacio", Toast.LENGTH_LONG).show();}
            else{
                if (dni.getText().toString().length() != 8) {
                    Toast.makeText(this, "Campo dni tiene que ser 8 digitos", Toast.LENGTH_LONG).show();
            } else {
                if (nombre.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Campo nombre vacío", Toast.LENGTH_LONG).show();
                } else {
                    if (celular.getText().toString().isEmpty()) {
                        Toast.makeText(this, "Campo celular vacio", Toast.LENGTH_LONG).show();}
                    else{
                        if (celular.getText().toString().length() != 9) {
                            Toast.makeText(this, "Campo celular tiene que ser 9 digitos", Toast.LENGTH_LONG).show();
                    } else {
                        if (ciudad.getText().toString().isEmpty()) {
                            Toast.makeText(this, "Campo ciudad vacio", Toast.LENGTH_LONG).show();
                        } else {
                            if (correoOpc.getText().toString().isEmpty()) {
                                Toast.makeText(this, "Campo correo opcional vacio", Toast.LENGTH_LONG).show();
                    } else {
                        if (internet.isChecked() == false && universidad.isChecked()==false  && tvMedio.isChecked() == false) {
                            Toast.makeText(this, "Seleccione una opcion", Toast.LENGTH_LONG).show();
                        } else {
                            Intent registro = new Intent(this, InscripcionTerminada.class);

                            if (internet.isChecked()){
                                Toast.makeText(this, "Se ha seleccionado Internet", Toast.LENGTH_LONG).show();
                            }
                            if (universidad.isChecked()){
                                Toast.makeText(this, "Se ha seleccionado Universidad", Toast.LENGTH_LONG).show();
                            }
                            if (tvMedio.isChecked()){
                                Toast.makeText(this, "Se ha seleccionado TV y/u otro medio", Toast.LENGTH_LONG).show();
                            }

                            startActivity(registro);
                        }
                    }
                }
            }
        }}}}}}}

