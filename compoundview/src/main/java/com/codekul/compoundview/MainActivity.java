package com.codekul.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /*1.*/LayoutInflater inflater =
                (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        /*2.*/inflater = getLayoutInflater();

        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));

        View viewPrimary = inflater.inflate(R.layout.activity_main,rootLayout,true);
        ImageView imageView = (ImageView) viewPrimary.findViewById(R.id.imageView);
        TextView textView = (TextView) viewPrimary.findViewById(R.id.textView);
        //rootLayout.addView(viewPrimary);

        View secondary = inflater.inflate(R.layout.other_view,rootLayout,true);
        //rootLayout.addView(secondary);

        setContentView(rootLayout);
    }
}
