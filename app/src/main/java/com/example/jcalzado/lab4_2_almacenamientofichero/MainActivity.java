package com.example.jcalzado.lab4_2_almacenamientofichero;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText etSalida, etEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etEntrada = (EditText) findViewById(R.id.etEntrada);
        etSalida = (EditText) findViewById(R.id.etSalida);
        etSalida.setClickable(true);
        etSalida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDatos();
            }
        });
    }

    public void escribir (View v) {
        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            File rutaSD = new File(tarjetaSD.getAbsolutePath(),"mytextfile.txt");

            OutputStreamWriter archivo = new OutputStreamWriter(new FileOutputStream(rutaSD,true));

            archivo.append(etEntrada.getText().toString() + "\n");
            archivo.flush();
            archivo.close();
            Toast.makeText(this, "Datos añadidos.", Toast.LENGTH_SHORT).show();
            etEntrada.setText("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarDatos () {
        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            File rutaSD = new File(tarjetaSD.getAbsolutePath(),"mytextfile.txt");

            FileInputStream flujoArchivo = new FileInputStream(rutaSD);
            InputStreamReader archivo = new InputStreamReader(flujoArchivo);
            BufferedReader buferLectura = new BufferedReader(archivo);
            String linea = buferLectura.readLine();
            String texto = "";
            while (linea != null) {
                texto += linea + "\n";
                linea = buferLectura.readLine();
            }
            buferLectura.close();
            archivo.close();
            etSalida.setText(texto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
