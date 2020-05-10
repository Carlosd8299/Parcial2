package com.cdlc.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

public class Listado extends AppCompatActivity {

    PersonaController c;
    ListView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        listado = findViewById(R.id.listado);
        c = new PersonaController(getApplicationContext());

        Cursor cur = c.allPersonas();

        PersonaCursorAdapter eca = new PersonaCursorAdapter(this,cur,0);
        listado.setAdapter(eca);
        eca.notifyDataSetChanged();
    }
}
