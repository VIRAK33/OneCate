package com.example.onecat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class OneCate extends AppCompatImageView {
    public OneCate(Context context) {
        super(context);
        init(context,null,0);
    }

    public OneCate(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0);
    }

    public OneCate(Context context,@Nullable AttributeSet attrs,int defStyleAttrs) {
        super(context,attrs,defStyleAttrs);
        init(context,attrs,defStyleAttrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttrs){
        setImageDrawable(context.getDrawable(R.drawable.cat));
    }
}
