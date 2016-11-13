package org.joelcano.projectes.horari;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    String modul = "nop";
    String profe = "nein";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar hora = Calendar.getInstance();
        int segons = hora.get(Calendar.HOUR_OF_DAY) * 3600;
        segons += hora.get(Calendar.MINUTE)*60;
        int dia = hora.get(Calendar.DAY_OF_WEEK);

        Auxiliar usdbh =new Auxiliar(this, "DBClasses", null, 1);
        SQLiteDatabase db = usdbh.getWritableDatabase();

        //Cursor c = db.rawQuery("SELECT modul, profe FROM horari WHERE id = 1", null);
        String[] campos = new String[] {"modul", "profe"};
        String[] args = new String[] {String.valueOf(segons), String.valueOf(segons), String.valueOf(dia)};
        //String[] args = new String[] {"1"};

        Cursor c = db.query("horari", campos, "horainici<? AND horafi>? AND diasetm=? ", args, null, null, null);
        if (c.moveToFirst()) {
            do {
                modul = c.getString(0);
                profe = c.getString(1);
            } while(c.moveToNext());
        }
        TextView tvModul = (TextView) findViewById(R.id.tv_modul);
        tvModul.setText(modul);
        TextView tvProfe = (TextView) findViewById(R.id.tv_profe);
        tvProfe.setText(profe);
    }
}
