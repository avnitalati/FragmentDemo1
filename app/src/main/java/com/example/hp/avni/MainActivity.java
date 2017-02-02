package com.example.hp.avni;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.hp.avni.R.layout.fragment2;


public class MainActivity extends AppCompatActivity {
    private LinearLayout l2;
    private Button btn1,btn2,btn3;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l2=(LinearLayout )findViewById(R.id.l2 );
        btn1=(Button )findViewById(R.id .btn1 );
        btn2=(Button )findViewById(R.id .btn2 );
        btn3=(Button )findViewById(R.id.btn3 );

        btn1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 =new Fragment1();
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l2,fragment1);
                ft.addToBackStack("");
                ft.commit() ;
            }
        });

        btn2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 =new Fragment2();
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l2,fragment2);
                ft.addToBackStack("");
                ft.commit() ;
            }
        });

        btn3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 =new Fragment3();
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l2,fragment3);
                ft.addToBackStack("");
                ft.commit() ;
            }
        });
    }
}
