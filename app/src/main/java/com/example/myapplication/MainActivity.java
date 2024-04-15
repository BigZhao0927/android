package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //设置圆角
        // 加载图片并设置圆角

        //设置缩进
        TextView textView = findViewById(R.id.textView);
        String text = "宽松学院风连衣裙B.Duck";

        // 创建一个 SpannableString 对象
        SpannableString spannableString = new SpannableString(text);

        // 设置第一行的缩进
        int firstLineIndent = 300; // 缩进的像素值
        LeadingMarginSpan.Standard leadingMarginSpan = new LeadingMarginSpan.Standard(firstLineIndent, 0);
        spannableString.setSpan(leadingMarginSpan, 0, text.indexOf('\n') + 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        // 将 SpannableString 设置到 TextView 中
        textView.setText(spannableString);

        //第二行
        SpannableStringBuilder builder = new SpannableStringBuilder();

// 第一部分文本
        String text1 = "￥";
        SpannableString span1 = new SpannableString(text1);
        span1.setSpan(new AbsoluteSizeSpan(20, true), 0, text1.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        span1.setSpan(new ForegroundColorSpan(Color.parseColor("#FFA500")), 0, text1.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        builder.append(span1);

// 第二部分文本
        String text2 = "241";
        SpannableString span2 = new SpannableString(text2);
        span2.setSpan(new AbsoluteSizeSpan(30, true), 0, text2.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        span2.setSpan(new ForegroundColorSpan(Color.parseColor("#FFA500")), 0, text2.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        builder.append(span2);

        // 第三部分文本
        String text3 = "500+人付款";
        SpannableString span3 = new SpannableString(text3);
        span3.setSpan(new AbsoluteSizeSpan(18, true), 0, text3.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        span3.setSpan(new ForegroundColorSpan(Color.parseColor("#DCDCDC")), 0, text3.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        builder.append(span3);

// 将 SpannableStringBuilder 设置给 TextView
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(builder);



        //最后一行
        SpannableStringBuilder builder2 = new SpannableStringBuilder();
        String texta = "回头客4万";
        SpannableString spana = new SpannableString(texta);
        spana.setSpan(new AbsoluteSizeSpan(15, true), 0, texta.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spana.setSpan(new ForegroundColorSpan(Color.parseColor("#FFA500")), 0, texta.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        builder2.append(spana);

        String textb = " Bduck服饰旗舰店 >";
        SpannableString spanb = new SpannableString(textb);
        spanb.setSpan(new AbsoluteSizeSpan(15, true), 0, textb.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spanb.setSpan(new ForegroundColorSpan(Color.parseColor("#000000")), 0, textb.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        builder2.append(spanb);

        TextView textView7 = findViewById(R.id.textView7);
        textView7.setText(builder2);
    }

    //更多按钮
    public void moreactions(View view) {
    }

    //进入店铺按钮
    public void toshop(View view) {
    }




}
