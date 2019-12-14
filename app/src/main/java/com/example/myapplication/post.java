package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class post {
    private String title;
    private String text;
    private Drawable drawable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
