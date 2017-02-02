package com.example.hp.avni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hp on 2/1/2017.
 */

public class Fragment3 extends Fragment  {

    private Button btnGoTo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R.layout .fragment3 ,container ,false );
        btnGoTo =(Button )view.findViewById(R.id .btnGoTo);
        btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();;
            }
        });
        return view;




    }

}
