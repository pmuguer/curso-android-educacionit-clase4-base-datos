package com.example.pablo.clase4basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.SQLException;
import java.util.List;

public class ListadoActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        listView = (ListView)findViewById(R.id.listView);

        try {
            List<Contacto> contactos = ContactoFactory.getInstance(this).obtenerContactos();
            listView.setAdapter(new ContactoAdapter(contactos));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
