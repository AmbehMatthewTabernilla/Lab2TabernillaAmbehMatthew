package com.tabernilla.lab2tabernillaambehmatthew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Validate extends AppCompatActivity {
EditText course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate_main);
        course = findViewById(R.id.editText9);
    }

    public void validate(View v)
    {
        SharedPreferences sp = getSharedPreferences("myData",MODE_PRIVATE);
        String course1 = sp.getString("Mass", null);
        String course2 = sp.getString("Info", null);
        String course3 = sp.getString("Infosys", null);
        String course4 = sp.getString("Chem", null);
        String course5 = sp.getString("Mech", null);
        String course6 = sp.getString("Acc", null);
        String course7 = sp.getString("Econ", null);
        String course8 = sp.getString("Polsci", null);
        String checkCourse = course.getText().toString();

        if(checkCourse.equals(course1) || checkCourse.equals(course2) || checkCourse.equals(course3) || checkCourse.equals(course4)
        || checkCourse.equals(course5) || checkCourse.equals(course6) || checkCourse.equals(course7) || checkCourse.equals(course8)){
            Toast.makeText(this,"course is offered in UST", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "course is not offered in UST", Toast.LENGTH_LONG).show();
        }

    }
    public void previous(View v)
    {
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
    }
}
