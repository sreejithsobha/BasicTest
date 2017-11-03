package com.example.user.basictest;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ListView listView;
    Button btn1;
    StudentAdapter sda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=(Button) findViewById(R.id.addinfo);
        btn1.setOnClickListener(this);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList = StudentInfo.arrayList;
        listView=(ListView) findViewById(R.id.student);


        StudentAdapter studentAdapter = new StudentAdapter(Main2Activity.this,StudentInfo.arrayList);
        listView.setAdapter(studentAdapter);


        /*String[] studentlist={"Hello","Hi"};*/


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.addinfo){
            startActivity(new Intent(Main2Activity.this,StudentInfo.class));
            finish();
        }
    }
}
