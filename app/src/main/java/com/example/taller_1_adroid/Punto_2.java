package com.example.taller_1_adroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Punto_2 extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private EditText n3;
    private EditText n4;
    private TextView nf;
    private Button Nuevo;
  //  private Button Anterior;
    private Button promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto_2);
        n1 = (EditText) findViewById(R.id.txtN_1);
        n2 = (EditText) findViewById(R.id.txtN_2);
        n3 = (EditText) findViewById(R.id.txtN_3);
        n4 = (EditText) findViewById(R.id.txtN_4);
        nf = (TextView) findViewById(R.id.txtN_F);
        promedio = (Button) findViewById(R.id.btnPromedio);
        //  Anterior = (Button) findViewById(R.id.btnAnterior);
        Nuevo = (Button) findViewById(R.id.btnNuevo);

        promedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                float n_1 = 0, n_2 = 0, n_3 = 0, n_4 = 0;
                n_1 = Float.parseFloat(n1.getText().toString());
                n_2 = Float.parseFloat(n2.getText().toString());
                n_3 = Float.parseFloat(n3.getText().toString());
                n_4 = Float.parseFloat(n4.getText().toString());
                nf.setText(((n_1 + n_2 + n_3 + n_4) / 4) + "");
                String MNS_n_f = nf.getText().toString();
                Toast.makeText(Punto_2.this, "La nota final es: " + MNS_n_f, Toast.LENGTH_LONG).show();
            }

        });

        Nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                n1.setText("");
                n2.setText("");
                n3.setText("");
                n4.setText("");
                nf.setText("");
                Toast.makeText(Punto_2.this, "Ingrese nuevas Notas", Toast.LENGTH_LONG).show();
            }


        });
    }
        public void Anterior (View view){
            Intent anterior = new Intent(this, MainActivity.class);
            startActivity(anterior);
       }
    }



