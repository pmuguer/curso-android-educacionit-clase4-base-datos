package com.example.pablo.clase4basededatos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactoAdapter extends BaseAdapter {
    private List<Contacto> listaDeContactos;

    public ContactoAdapter(List<Contacto> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }

    @Override
    public int getCount() {
        return listaDeContactos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDeContactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_contacto, parent, false);

        Contacto contacto = (Contacto)getItem(position);
        TextView telefono = (TextView)view.findViewById(R.id.textViewTelefono);
        TextView nombre = (TextView)view.findViewById(R.id.textViewNombre);
        TextView apellido = (TextView)view.findViewById(R.id.textViewApellido);

        telefono.setText(String.valueOf(contacto.getTelefono()));
        nombre.setText(contacto.getNombre());
        apellido.setText(contacto.getApellido());

        return view;
    }
}
