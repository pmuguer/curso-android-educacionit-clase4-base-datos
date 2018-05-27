package com.example.pablo.clase4basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

// Extender de clase OrmLiteSQlit.... e implementar metodos
public class DatabaseHelper extends OrmLiteSqliteOpenHelper{
    // Toda bd debe tener nombre y versio
    private static final String NOMBRE_DB = "Mi_DB";
    private static final int VERSION_DB = 1;

    public DatabaseHelper(Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            // Usamos TableUtils.createTable para crear la tabla
            // debemos pasar la clase sobre la que queremos trabajar
            TableUtils.createTable(connectionSource, Contacto.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Para cuando se modifica la estructura de la BD
    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
