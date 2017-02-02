package com.example.hp.avni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.security.PrivateKey;

import static android.R.attr.fragment;
import static com.example.hp.avni.R.id.btn2;

/**
 * Created by Hp on 2/1/2017.
 */

public class Fragment1 extends Fragment  {

    private Button btnrbi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater .inflate(R.layout .fragment1 ,container ,false );
         btnrbi=(Button )view.findViewById(R.id.btnrbi );
        btnrbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 =new Fragment2() ;
                getFragmentManager().beginTransaction() .replace(R.id .l2 ,fragment2 ) .addToBackStack("").commit();
            }
        });
        return view;
    }
}
