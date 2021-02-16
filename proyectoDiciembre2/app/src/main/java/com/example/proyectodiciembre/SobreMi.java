package com.example.proyectodiciembre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SobreMi extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private Button redes;
    private Button ubicacion;
    private Button comentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_mi);
        redes = findViewById(R.id.mostrarRedes);

        redes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SobreMi.this,"onClicklistener",Toast.LENGTH_LONG).show();


                Log.d(LOG_TAG, "Botón presionado");
                String url = "https://twitter.com/home?lang=es";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "No se ha podido abrir la información!");
                }
            }

        });

        ubicacion = findViewById(R.id.ubicacion);

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SobreMi.this,"onClicklistener",Toast.LENGTH_LONG).show();


                Uri gmmIntentUri = Uri.parse("google.streetview:cbll= 41.2879252,-4.6862446");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);


            }

        });

        comentarios = findViewById(R.id.comentarios);

        comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SobreMi.this,"onClicklistener",Toast.LENGTH_LONG).show();


                Log.d(LOG_TAG, "Botón presionado");
                String texto = "Que dificil es programar en Androdid";
                String type = "text/plain";
                ShareCompat.IntentBuilder
                        .from(SobreMi.this)
                        .setType(type)
                        .setChooserTitle(R.string.comentarios)
                        .setText(texto)
                        .startChooser();
            }

        });

        }

    }
