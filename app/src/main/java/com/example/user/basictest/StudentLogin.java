package com.example.user.basictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentLogin extends AppCompatActivity implements View.OnClickListener{
  EditText stdname,stdpassword;
  Button stdlogin;
    Student std;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        stdname=(EditText) findViewById(R.id.stduser);
        stdpassword=(EditText) findViewById(R.id.stdpassword);
        stdlogin=(Button) findViewById(R.id.stdLogin);
        stdlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.stdLogin){
            String studentname=stdname.getText().toString().trim();
            String studentpassword=stdpassword.getText().toString().trim();



            }
        }

    }

