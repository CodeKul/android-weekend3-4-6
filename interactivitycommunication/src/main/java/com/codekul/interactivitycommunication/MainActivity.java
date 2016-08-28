package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_MY_DATE = "date";
    private static final int REQ_CALENDAR = 1234;
    public static final String KEY_MY_CAR = "car";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Class<?> cls = NextActivity.class;

                Intent intent =
                        new Intent(MainActivity.this,cls);

                Bundle bundle = new Bundle();
                bundle.putLong(KEY_MY_DATE,System.currentTimeMillis());
                bundle.putSerializable(KEY_MY_CAR,new Car());

                intent.putExtras(bundle);
             //   startActivity(intent);
                startActivityForResult(intent,REQ_CALENDAR);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQ_CALENDAR)
            if(resultCode == RESULT_OK)
                ((TextView)findViewById(R.id.textDate))
                        .setText(new Date(data
                                .getExtras()
                                .getLong(NextActivity.KEY_SELECTED_DATE))
                                .toString());
    }
}
