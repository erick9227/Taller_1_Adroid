package com.example.taller_1_adroid;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v4.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText hora;
    private EditText valorHora;
    private TextView ValorPago;
    private Button calcular;
    private Button Nuevo;
   // private Button Siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hora = (EditText) findViewById(R.id.txtHora);
        valorHora = (EditText) findViewById(R.id.txtValorHora);
       ValorPago = (TextView) findViewById(R.id.txtValorPago);
        calcular = (Button) findViewById(R.id.btnCalcular);
      //  Siguiente=(Button)findViewById(R.id.btnSiguiente);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                float nhoras=0,vhoras=0,vpago=0;
                nhoras=Float.parseFloat(hora.getText().toString());
                vhoras=Float.parseFloat(valorHora.getText().toString());
                ValorPago.setText((nhoras*vhoras) + "");

                String msn = ValorPago.getText().toString();
                Toast.makeText(MainActivity.this, "El pago es de: " + msn, Toast.LENGTH_LONG).show();
            }
        });
        Nuevo = (Button) findViewById(R.id.btnNuevo);

        Nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                hora.setText("");
                valorHora.setText("");
                ValorPago.setText("");
                Toast.makeText(MainActivity.this, "Ingrese nuevos valores", Toast.LENGTH_LONG).show();
            }
    });
    }
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, Punto_2.class);
        startActivity(siguiente);
    }
}
