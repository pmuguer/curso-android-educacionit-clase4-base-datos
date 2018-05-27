package com.example.pablo.clase4basededatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrmLiteActivity extends AppCompatActivity {

    private Button botonAgregar;
    private Button botonListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ormlite);

        botonAgregar = (Button)findViewById(R.id.botonAgregar);
        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrmLiteActivity.this, AgregarActivity.class);
                startActivity(intent);
            }
        });

        botonListar = (Button)findViewById(R.id.botonListar);
        botonListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrmLiteActivity.this, ListadoActivity.class);
                startActivity(intent);
            }
        });
    }
}
