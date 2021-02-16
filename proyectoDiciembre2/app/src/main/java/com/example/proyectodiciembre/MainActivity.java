package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bienvenido;
    public static final int TEXT_REQUEST = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bienvenido = findViewById(R.id.botonBienvenida);
        Toast.makeText(MainActivity.this,"centerCrop",Toast.LENGTH_LONG).show();

        bienvenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"onClicklistener",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivityForResult(intent, TEXT_REQUEST);

            }

        });





    }
}