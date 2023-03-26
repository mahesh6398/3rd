package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment fragment1=new FirstFragment();
        SecondFragment fragment2=new SecondFragment();
        FragmentManager managerF = getSupportFragmentManager();

        FragmentTransaction Transaction = managerF.beginTransaction();

        Transaction.add(R.id.frameLayout,fragment1);

        Button b1 = findViewById(R.id.button3);
        Button b2 = findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager managerF = getSupportFragmentManager();
                FragmentTransaction Transaction = managerF.beginTransaction();
                Transaction.replace(R.id.frameLayout,fragment1);

                Toast.makeText(MainActivity.this,"Changed to Fragment1",Toast.LENGTH_LONG).show();
                        Transaction.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager managerF = getSupportFragmentManager();
                FragmentTransaction Transaction = managerF.beginTransaction();
                Transaction.replace(R.id.frameLayout,fragment2);
                Toast.makeText(MainActivity.this,"Changed to Fragment1",Toast.LENGTH_LONG).show();
                        Transaction.commit();
            }
        });
    }}

