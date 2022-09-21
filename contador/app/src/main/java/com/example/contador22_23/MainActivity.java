package com.example.contador22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont; // creas una variable contador
    TextView txt_contador = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cont = 0;
        // hay que enlazar la variable con la pantalla ->View
        txt_contador = findViewById(R.id.txt_contador);
    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this, "HOLA A TODOS",Toast.LENGTH_SHORT).show();
    }

    public void contarNumero(View view) {
        cont++;
        // volver a pintar txt_contador
        txt_contador.setText(String.valueOf(cont));
    }

    public void resetearContador(View view) {
        cont = 0;
        txt_contador.setText(String.valueOf(cont));

    }
}