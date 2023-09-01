package com.curso.android.app.practica.uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import Clases.Operaciones;

public class MainActivity extends AppCompatActivity {

    private Button btComprobar;
    private Button btLimpiar;
    private EditText etPrimero;
    private EditText etSegundo;
    private TextView tvMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvMostrar = findViewById(R.id.tvMensaje);
        btComprobar = findViewById(R.id.btComprobar);
        btLimpiar = findViewById(R.id.btLimpiar);
        etPrimero = findViewById(R.id.etPrimero);
        etSegundo = findViewById(R.id.etSegundo);
        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operaciones op = new Operaciones();
                op.limpiarComponentes(etPrimero,etSegundo,tvMostrar);
            }
        });
        btComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operaciones op = new Operaciones();
                if (op.compararValores(etPrimero.getText().toString(),etSegundo.getText().toString()) == true)
                {
                    tvMostrar.setText("Los valores ingresados son iguales");
                }
                else
                {
                    tvMostrar.setText("Los valores ingresados no son iguales");
                }
            }
        });
    }


}