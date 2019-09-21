package com.tabernilla.lab2tabernillaambehmatthew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
EditText etMass, etInfo, etInfosys, etChem, etMech, etAcc, etEcon, etPolsci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMass = findViewById(R.id.editText);
        etInfo = findViewById(R.id.editText2);
        etInfosys = findViewById(R.id.editText3);
        etChem = findViewById(R.id.editText4);
        etMech = findViewById(R.id.editText5);
        etAcc = findViewById(R.id.editText6);
        etEcon = findViewById(R.id.editText7);
        etPolsci = findViewById(R.id.editText8);
    }
    public void saveData (View v)
    {
        SharedPreferences sp = getSharedPreferences("myData",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String Mass = etMass.getText().toString();
        String Info = etInfo.getText().toString();
        String Infosys = etInfosys.getText().toString();
        String Chem = etChem.getText().toString();
        String Mech = etMech.getText().toString();
        String Acc = etAcc.getText().toString();
        String Econ = etEcon.getText().toString();
        String Polsci = etPolsci.getText().toString();
        editor.putString("Mass", Mass);
        editor.putString("Info", Info);
        editor.putString("Infosys", Infosys);
        editor.putString("Chem", Chem);
        editor.putString("Mech", Mech);
        editor.putString("Acc", Acc);
        editor.putString("Econ", Econ);
        editor.putString("Polsci", Polsci);
        editor.commit();
        Toast.makeText(this, "Data was saved", Toast.LENGTH_SHORT).show();
    }
    public void displayAct(View v){
        Intent i = new Intent(this, Validate.class);
        startActivity(i);
    }


}
