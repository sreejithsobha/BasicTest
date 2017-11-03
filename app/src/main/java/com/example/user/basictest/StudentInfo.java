package com.example.user.basictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentInfo extends AppCompatActivity implements View.OnClickListener {
    EditText rollno, name, mobile;
    Button save;
    public static ArrayList<Student> arrayList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        rollno = (EditText) findViewById(R.id.rollno);
        name = (EditText) findViewById(R.id.name);
        mobile = (EditText) findViewById(R.id.mobile);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.save) {

            String stdrln = rollno.getText().toString();
            String stdname = name.getText().toString();
            String stdmobile = mobile.getText().toString();

            Student std = new Student();
            std.setRollno(stdrln);
            std.setName(stdname);
            std.setMobile(stdmobile);
            arrayList.add(std);
            for (Student student : arrayList) {
                Log.e("Display", student.getName());
            }
        }
        startActivity(new Intent(StudentInfo.this, Main2Activity.class));
        finish();

    }
}

