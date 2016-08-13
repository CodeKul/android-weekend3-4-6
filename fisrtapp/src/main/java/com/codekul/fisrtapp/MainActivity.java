package com.codekul.fisrtapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
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
}
