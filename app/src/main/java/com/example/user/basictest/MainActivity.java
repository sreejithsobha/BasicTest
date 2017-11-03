package com.example.user.basictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et1,et2;
    Button btn;
    String username="Sreejith";
    String password="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=(EditText)findViewById(R.id.username);
        et2=(EditText) findViewById(R.id.password);
        btn=(Button) findViewById(R.id.userlogin);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       if(v.getId()==R.id.userlogin){
           userLogin();
       }
    }

    public void userLogin(){
        String user=et1.getText().toString().trim();
        String userpassword=et2.getText().toString().trim();
        if(user.equals(username) && userpassword.equals(password)){
            Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_SHORT).show();
        }

    }
}
