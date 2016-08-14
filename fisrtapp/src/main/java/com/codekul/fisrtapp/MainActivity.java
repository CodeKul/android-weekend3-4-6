package com.codekul.fisrtapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Date;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final EditText edtName  = (EditText) findViewById(R.id.edtName);

        Button btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(this);
        btnOkay.setOnClickListener(new Click());
        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtName.setText(""+new Date());
            }
        });

    }

    private void createUiByCode(){

        LinearLayout layoutRoot =
                new LinearLayout(this);
        LinearLayout.LayoutParams paramsRoot =
                new LinearLayout.LayoutParams(500,500);
        layoutRoot.setLayoutParams(paramsRoot);

        EditText edtName = new EditText(this);
        LinearLayout.LayoutParams paramsName =
                new LinearLayout.LayoutParams(500,150);
        edtName.setLayoutParams(paramsName);
        layoutRoot.addView(edtName);

        Button btnOkay = new Button(this);
        LinearLayout.LayoutParams paramsBtn =
                new LinearLayout.LayoutParams(500,150);
        btnOkay.setLayoutParams(paramsBtn);
        layoutRoot.addView(btnOkay);

        setContentView(layoutRoot);
    }

    @Override
    public void onClick(View v) {

    }

    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View v) {

        }
    }
}
