package com.example.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

public class Information {
     static int i;

    public  static ArrayList<post> data(Context context) {
        ArrayList<post> Post = new ArrayList<>();
        for (i = 1; i <= 15; i++) {
            post po = new post();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            }
            po.setTitle("خواص گیاهی"+i);
            po.setText("مایکروسافت نسخه\u200C جایگزین ویندوز 8.1 را با نام ویندوز 10 به صورت رسمی منتشر کرد. مایکروسافت منوی استارت را که با معرفی ویندوز 8، حذف شد، به محیط دسکتاپ، ویندوز 10 باز گردادنده است، سیستم\u200C جستجو در ویندوز 10 بهبود یافته و پشتیبانی از ماوس و صفحه\u200Cکلید نیز بهتر شده است. مایکروسافت در ویندوز جدید خود تلاش نموده تا به بازخوردهای کاربران قدیمی، توجه نموده و نیازهای آن\u200C ها را برآورده کند. ویندوز 10 ترکیبی از قابلیت\u200Cهای خوب ویندوز 7 و ویندوز 8.1 به شمار می\u200Cرود");
            Post.add(po);
        }
        return Post;
    }
}
