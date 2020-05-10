package com.cdlc.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ActualizarRegistro extends AppCompatActivity implements View.OnClickListener {

    EditText  nom, salario;
    Spinner snivelescolar,  sestrato;
    Button guardar, listado;
    //   Button actualizar, consultar;
    Persona persona;
    PersonaController c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_registro);

        nom = findViewById(R.id.txtnombreAc);
        salario = findViewById(R.id.txtsalarioAc);

        snivelescolar = findViewById(R.id.Spn_nivelEAc);
        snivelescolar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        sestrato = findViewById(R.id.Spn_estratoAc);
        sestrato.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        guardar = findViewById(R.id.btnActualizar);
        guardar.setOnClickListener(this);

        listado = findViewById(R.id.btnVolver);
        listado.setOnClickListener(this);



        c = new PersonaController(getApplicationContext());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnActualizar:
                if(nom.getText().toString().equals("")|| salario.getText().toString().equals("")){
                    Toast.makeText(this,"Rellene todos los campos",Toast.LENGTH_LONG).show();

                }else{

                    Intent intent = getIntent();
                    String code= intent.getStringExtra("codigo");

                    int estrato = Integer.parseInt(sestrato.getSelectedItem().toString()) ;
                    String nivelEdu = snivelescolar.getSelectedItem().toString();

                    persona = new Persona(nom.getText().toString(),nivelEdu,estrato,code, Double.parseDouble(salario.getText().toString()));
                    Toast.makeText(getApplicationContext(), persona.cedula, Toast.LENGTH_SHORT).show();


                    if(c.buscarPersona(code)){
                        Log.d("Buscar", "No encontrado");
                        long id = c.actualizarPersona(persona,code);
                        Toast.makeText(getApplicationContext(), "Persona Actualizada", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Log.d("Buscar", "encontrado");
                        Toast.makeText(getApplicationContext(),"La persona no esta registrada",Toast.LENGTH_SHORT).show();
                    }
                }
                break;

            case R.id.btnVolver:
                Toast.makeText(getApplicationContext(),"Listado",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Registro.class);
                startActivity(i);
                break;
        }


    }
}
