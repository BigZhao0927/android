package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageView;

public class CustomRoundAngleImageView extends AppCompatImageView {
    float width, height;

    public CustomRoundAngleImageView(Context context) {
            this(context, null);
        init(context, null);
    }

    public CustomRoundAngleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        init(context, attrs);
    }

    public CustomRoundAngleImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        width = getWidth();
        height = getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int len=50;
        if (width >= 20 && height > 20) {
            Path path = new Path();
            //四个圆角
            path.moveTo(len, 0);
            path.lineTo(width - len, 0);
            path.quadTo(width, 0, width, len);
            path.lineTo(width, height - len);
            path.quadTo(width, height, width - len, height);
            path.lineTo(len, height);
            path.quadTo(0, height, 0, height - len);
            path.lineTo(0, len);
            path.quadTo(0, 0, len, 0);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }
}