package com.codekul.andriod.runtimechangesbyown;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "@codekul";

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Restratred");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE ){

            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.circle);
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.my);
        }
        else {
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.pin);
        }
    }
}
