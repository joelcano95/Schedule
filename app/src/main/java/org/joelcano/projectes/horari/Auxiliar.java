package org.joelcano.projectes.horari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Auxiliar extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE horari (id INTEGER PRIMARY KEY AUTOINCREMENT, diasetm INTEGER, horainici INTEGER," +
            " horafi INTEGER, modul TEXT, profe TEXT)";

    public Auxiliar(Context contexto, String nombre, CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
        insert(db);
    }

    public void insert(SQLiteDatabase db){
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "2, 54000, 64800, 'Desenvolupament d interficies', 'Leo')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "2, 64800, 66000, 'Pati', 'Entrepa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "2, 66600, 73200, 'Programacio', 'Josfea')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "2, 73200, 76800, 'Tutoria', 'Josefa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "3, 54000, 61200, 'Serveis i Processos', 'Marisol')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "3, 61200, 69600, 'Entorns de Desenvolupament', 'Lluis')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "3, 69600, 76800, 'Programacio', 'Josefa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "4, 57600, 61200, 'Serveis i Processos', 'Marisol')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "4, 61200, 69600, 'Programacio', 'Josefa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "4, 69600, 76800, 'Sistemes de gestió empresarial', 'Marta Planas')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "5, 54000, 61200, 'Programacio', 'Josefa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "5, 61200, 64800, 'Sistemes de gestió empresarial', 'Marta Planas')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "5, 64800, 66000, 'Pati', 'Entrepa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "5, 66000, 69600, 'Sistemes de gestió empresarial', 'Marta Planas')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "5, 69600, 76800, 'Entorns de Desenvolupament', 'Lluis')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "6, 54000, 61200, 'Programacio', 'Josefa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "6, 61200, 64800, 'Entorns de Desenvolupament', 'Lluis')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "6, 64800, 66000, 'Pati', 'Entrepa')");
        db.execSQL("INSERT INTO horari (diasetm, horainici, horafi, modul, profe) VALUES (" +
                "6, 66000, 69600, 'Entorns de Desenvolupament', 'Lluis')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS horari");

        db.execSQL(sqlCreate);
    }
}