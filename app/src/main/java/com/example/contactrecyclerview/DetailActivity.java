package com.example.contactrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView title;
    TextView notelf;
    TextView status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ListModel element = (ListModel) getIntent().getSerializableExtra("ListModel");
        title = findViewById(R.id.titleDetail);
        notelf = findViewById(R.id.noDetail);
        status= findViewById(R.id.statusDetail);

        title.setText(element.getTitle());
        title.setTextColor(Color.parseColor(element.getColor()));
        notelf.setText(element.getNo());
        status.setText(element.getStatus());



    }



}