package com.codekul.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by aniruddha on 27/8/16.
 */
public class OwnView extends TextView{

    private Paint pen;

    public OwnView(Context context) {
        super(context);

        // in code

        initPaint();
    }

    public OwnView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // in xml

        initPaint();
    }

    public void initPaint(){

        pen = new Paint();
        pen.setColor(Color.RED);
        pen.setStrokeWidth(3f);
        pen.setTextSize(120);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(80,90,40,pen);
        canvas.drawLine(80,90,200,200,pen);
        canvas.drawText("{code}kul", 200,200,pen);
    }
}
