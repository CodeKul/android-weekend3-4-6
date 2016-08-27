package com.codekul.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils
                        .loadAnimation(MainActivity.this,
                                R.anim.rotate);

                if(animation.isInitialized()) {
                    ((Button)findViewById(R.id.btnRotate)).setText("start");
                    findViewById(R.id.imageView).clearAnimation();
                }
                else {
                    ((Button)findViewById(R.id.btnRotate)).setText("stop");
                    findViewById(R.id.imageView)
                            .startAnimation(animation);
                }
            }
        });
    }
}
