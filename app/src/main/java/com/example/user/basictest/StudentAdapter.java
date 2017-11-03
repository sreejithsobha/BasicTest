package com.example.user.basictest;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

/**
 * Created by User on 11/1/2017.
 */

public class StudentAdapter extends BaseAdapter{

    ArrayList<Student> arrayList = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;



    public StudentAdapter(Context context,ArrayList<Student> arrayList){
        this.context=context;
        this.arrayList=arrayList;
        layoutInflater=LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

            convertView=layoutInflater.from(context).inflate(R.layout.activity_list_view,parent,false);
            Student list = (Student) getItem(position);

            final TextView textViewRollno = (TextView) convertView.findViewById(R.id.rollno);
            TextView textViewName = (TextView) convertView.findViewById(R.id.name);
            TextView textViewMobile = (TextView) convertView.findViewById(R.id.mobile);
            final Button btndelete=(Button) convertView.findViewById(R.id.delete);



            textViewName.setText(  "Name :  "     +  "  "  + list.getName()   + " " + " ");
            textViewRollno.setText("RollNo:  "   +  "  "  + list.getRollno() + " " + " ");
            textViewMobile.setText("Mobile:  "  +  "  "  + list.getMobile() + "\n");

        btndelete.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                StudentInfo.arrayList.remove(position);
                notifyDataSetChanged();
                /*Toast.makeText(v.getContext(),"Delete Item",Toast.LENGTH_LONG).show();*/

            }
        });
        return convertView;
    }




}
