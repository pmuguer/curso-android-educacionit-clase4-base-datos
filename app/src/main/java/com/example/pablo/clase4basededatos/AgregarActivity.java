package com.example.pablo.clase4basededatos;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.SQLException;

public class AgregarActivity extends AppCompatActivity {

    private EditText telefono;
    private EditText nombre;
    private EditText apellido;
    private Button botonAgregarContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        telefono = (EditText)findViewById(R.id.editTextTelefono);
        nombre = (EditText)findViewById(R.id.editTextNombre);
        apellido = (EditText)findViewById(R.id.editTextApellido);
        botonAgregarContacto = (Button)findViewById(R.id.botonAgregarContacto);

        botonAgregarContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacto contacto = new Contacto(Integer.valueOf(telefono.getText().toString()),
                        nombre.getText().toString(), apellido.getText().toString());
                try {
                    ContactoFactory.getInstance(AgregarActivity.this).guardarContacto(contacto);
                } catch (SQLException e){
                    e.printStackTrace();
                }

                onBackPressed();
            }

        });
    }
}
