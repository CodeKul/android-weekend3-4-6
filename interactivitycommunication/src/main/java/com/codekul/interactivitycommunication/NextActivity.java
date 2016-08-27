package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;

import java.util.Date;
import java.util.GregorianCalendar;

public class NextActivity extends AppCompatActivity {

    public static final String KEY_SELECTED_DATE = "selectedDate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        final GregorianCalendar cal = new GregorianCalendar();
        ((CalendarView) findViewById(R.id.calendar)).setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                cal.set(year,month,dayOfMonth);
                view.setDate(cal.getTimeInMillis());
            }
        });

        final Bundle bundle =getIntent()
                .getExtras();
        if(bundle != null)
            ((CalendarView) findViewById(R.id.calendar))
                    .setDate(bundle.getLong(MainActivity.KEY_MY_DATE));

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();

                Bundle bundleBack = new Bundle();
                bundleBack.putLong(KEY_SELECTED_DATE,((CalendarView) findViewById(R.id.calendar)).getDate());

                Log.i("@codekul",""+new Date(((CalendarView) findViewById(R.id.calendar)).getDate()));

                intent.putExtras(bundleBack);

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
