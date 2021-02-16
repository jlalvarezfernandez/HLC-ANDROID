package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CarritoCompra extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button botonAgregar;
    public static final int TEXT_REQUEST = 1;
    public static final String REPLICA = "com.android.example.segundaActividadCarritoCompra.extra.Reply";
    private LinearLayout linearLayout;
    private Button buscarSuper;
    private EditText supermarket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito_compra);

        botonAgregar = findViewById(R.id.agregar);
        linearLayout = findViewById(R.id.linearlayout);
        buscarSuper = findViewById(R.id.busquedaSuper);
        supermarket = findViewById(R.id.supermercado);

        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CarritoCompra.this,"onClicklistener",Toast.LENGTH_LONG).show();

                Log.d(LOG_TAG, "Botón presionado");
                Intent intent;
                intent = new Intent(CarritoCompra.this, productosCarrito.class);
                startActivityForResult(intent, TEXT_REQUEST);
            }

        });

        buscarSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Toast.makeText(CarritoCompra.this,"onClicklistener",Toast.LENGTH_LONG).show();
                buscaSuper(v);
            }

        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String articuloDevuelto = data.getStringExtra(productosCarrito.REPLICA);
                TextView textView = new TextView(this);
                textView.setText(articuloDevuelto);
                linearLayout.addView(textView);
            }
        }
    }

    public void buscaSuper(View view) {
        String loc =supermarket.getText().toString();
        Uri direccion = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, direccion);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "No se ha podido localizar!");
        }
    }
}