package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    private Button operacionesMatematicas;
    private Button bio;
    private Button carritoProductos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();
        operacionesMatematicas = findViewById(R.id.operaciones);
        bio = findViewById(R.id.informacion);
        carritoProductos = findViewById(R.id.carrito);
        operacionesMatematicas.setOnClickListener(this);
        bio.setOnClickListener(this);
        carritoProductos.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Menu.this,"onClicklistener",Toast.LENGTH_LONG).show();

        switch (v.getId()){
            case R.id.operaciones:
                Intent intent = new Intent(Menu.this, OperacionesMatematicas.class);
                startActivity(intent);
                break;
            case R.id.informacion:

                Intent intent2 = new Intent(Menu.this, SobreMi.class);
                startActivity(intent2);
                break;
            case R.id.carrito:

                Intent  intent3= new Intent(Menu.this, CarritoCompra.class);
                startActivity(intent3);
                break;
        }

    }
}