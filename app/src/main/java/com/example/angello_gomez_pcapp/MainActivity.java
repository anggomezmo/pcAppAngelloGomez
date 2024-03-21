package com.example.angello_gomez_pcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText inputProcesador,inputGpu,inputAlmacenamiento,inputMarca;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputProcesador=findViewById(R.id.inputProcesador);
        inputGpu=findViewById(R.id.inputGpu);
        inputAlmacenamiento=findViewById(R.id.inputAlmacenamiento);
        inputMarca=findViewById(R.id.inputMarca);
        txtResultado=findViewById(R.id.txtResultado);

    }

    public void registrarPc(View view){
        String procesador=inputProcesador.getText().toString();
        String tarjetaVideo=inputGpu.getText().toString();
        String almacenamiento=inputAlmacenamiento.getText().toString();
        String marca=inputMarca.getText().toString();
        Computador computador1= new Computador(procesador,tarjetaVideo,almacenamiento,marca);
        String textoResult= procesador+" "+tarjetaVideo+" "+almacenamiento+" "+marca;
        txtResultado.setText(textoResult);
    }
}