package com.example.pablo.clase4basededatos;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

// Anotación para que ormlite sepa como armar la tabla
// Esto especiica que la clase va a ser una tabla
@DatabaseTable(tableName = "contactos")
public class Contacto {

    @DatabaseField(id=true)
    private int telefono;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String apellido;

    public Contacto() { ;
    }

    public Contacto(int telefono, String nombre, String apellido) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
