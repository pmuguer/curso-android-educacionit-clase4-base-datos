package com.example.pablo.clase4basededatos;

import android.content.Context;

import com.example.pablo.clase4basededatos.Contacto;
import com.example.pablo.clase4basededatos.DatabaseHelper;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import java.util.List;

public class ContactoFactory {
    private static ContactoFactory instance;

    // El integer es el id de la tabla
    private Dao<Contacto, Integer> dao;

    public static ContactoFactory getInstance(Context context) {
        if (instance == null) {
            instance = new ContactoFactory(context);
        }
        return instance;
    }

    private ContactoFactory(Context context) {
        // Abrimos una conexión con la base de datos (DatabaseHelper.class)
        OrmLiteSqliteOpenHelper helper = OpenHelperManager.getHelper(context, DatabaseHelper.class);

        try {
            // Instanciamos nuestro objeto dao y le indicamos con que clase va a trabajar
            dao = helper.getDao(Contacto.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarContacto(Contacto contacto) throws SQLException{
        dao.create(contacto);
    }

    public List<Contacto> obtenerContactos() throws SQLException{
        return dao.queryForAll();
    }
}
