package com.example.user.basictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserLogins extends AppCompatActivity implements View.OnClickListener{
     Button btnadmin,btnstudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_logins);

        btnadmin=(Button) findViewById(R.id.adminuser);
        btnstudent=(Button) findViewById(R.id.studentuser);
        btnadmin.setOnClickListener(this);
        btnstudent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.adminuser:
                startActivity(new Intent(UserLogins.this,MainActivity.class));
                break;

            case R.id.studentuser:
                startActivity(new Intent(UserLogins.this,StudentLogin.class));
                break;
        }
    }
}
