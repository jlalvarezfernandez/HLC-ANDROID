package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProductosCarrito extends AppCompatActivity {
    private static final String LOG_TAG= MainActivity.class.getSimpleName();
    private Button botonMayonesa;
    private Button botonMantequilla;
    private Button botonPeras;
    private Button botonManzanas;
    private Button botonKiwis;
    private Button botonSandias;
    private Button botonPatatas;
    private Button botonCebollas;
    private Button botonPlatanos;
    private Button botonNaranjas;


    private Button botonAgregar;
    public static final String REPLICA = "com.android.example.productoscarrito.extra.Reply";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_carrito);
        botonMayonesa=findViewById(R.id.mayonesa);
        botonMantequilla=findViewById(R.id.mantequilla);
        botonPeras=findViewById(R.id.peras);
        botonManzanas=findViewById(R.id.manzanas);
        botonKiwis=findViewById(R.id.kiwis);
        botonSandias=findViewById(R.id.sandias);
        botonPatatas=findViewById(R.id.patatas);
        botonCebollas=findViewById(R.id.cebollas);
        botonPlatanos=findViewById(R.id.platanos);
        botonNaranjas=findViewById(R.id.naranjas);

        Log.d(LOG_TAG, "Botón presionado 2");


        botonMayonesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();
                ProductosCarrito.this.devolverArticulos(v);
            }
        });
        botonMantequilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();
                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonPeras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonManzanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonKiwis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonSandias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonPatatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonCebollas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonPlatanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });
        botonNaranjas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductosCarrito.this,"onClicklistener",Toast.LENGTH_LONG).show();

                ProductosCarrito.this.devolverArticulos(v);

            }
        });


    }

    public void devolverArticulos(View v){
        botonAgregar=findViewById(v.getId());
        Intent intent;
        intent = new Intent( this, MainActivity.class);
        String articulo = botonAgregar.getText().toString();
        intent.putExtra(REPLICA, articulo);
        setResult(RESULT_OK,intent);
        finish();

    }

}