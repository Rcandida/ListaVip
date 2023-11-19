package br.edu.unichristus.listaintencao.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ListaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "lista.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;
    SQLiteDatabase db;


    public ListaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaLista = "CREATE TABLE Lista (id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nome TEXT, " +
                "matricula TEXT," +
                "curso TEXT," +
                "telefone TEXT)";

        db.execSQL(sqlTabelaLista);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}