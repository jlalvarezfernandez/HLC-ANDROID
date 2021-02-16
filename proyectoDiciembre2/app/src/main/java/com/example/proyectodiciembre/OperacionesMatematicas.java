package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OperacionesMatematicas extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button sumar;
    private Button multi;
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_matematicas);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);
        sumar = findViewById(R.id.suma);
        multi = findViewById(R.id.multiplicacion);
        resul = findViewById(R.id.resultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OperacionesMatematicas.this,"onClicklistener",Toast.LENGTH_LONG).show();
                try {
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    resul.setText((numero1+numero2)+"");

                } catch (Exception e){
                    resul.setText("Introduce los datos");
                }


            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OperacionesMatematicas.this,"onClicklistener",Toast.LENGTH_LONG).show();
                try {
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    resul.setText((numero1*numero2)+"");

                } catch (Exception e){
                    resul.setText("Introduce los datos");
                }

            }
        });

    }
}