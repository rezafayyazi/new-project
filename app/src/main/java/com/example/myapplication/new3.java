package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.gauravbhola.ripplepulsebackground.RipplePulseLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.skyfishjy.library.RippleBackground;

import java.util.ArrayList;

import static androidx.recyclerview.widget.LinearLayoutManager.VERTICAL;

public class new3 extends AppCompatActivity implements adapter.onclick {
    Toolbar toolbar;
    Context context;
    adapter Adapter;
    ImageView imageView1, imageView2, imageView, imageView4, imageView5;
    ArrayList<post> name;

    ArrayList<post> sname;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new3);

        RecyclerView recyclerView = findViewById(R.id.Recycle);
        Adapter = new adapter(this, Information.data(this), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, VERTICAL, false));
        recyclerView.setAdapter(Adapter);

        imageView1 = findViewById(R.id.g);
        imageView1.setImageResource(R.drawable.adamak);


        /*imageView2=findViewById(R.id.ggg);
        imageView2.setImageResource(R.drawable.adamak);*/


        imageView4 = findViewById(R.id.search2);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.incloudsearch);
                view.setVisibility(View.VISIBLE);
            }
        });
        imageView5=findViewById(R.id.backk);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view1 = findViewById(R.id.incloudtool);
                view1.setVisibility(View.VISIBLE);
                View view2 = findViewById(R.id.incloudsearch);
                view2.setVisibility(View.GONE);


            }
        });





        imageView = findViewById(R.id.menu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerLayout = findViewById(R.id.drawerLayout1);
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });


        name = new ArrayList<>();
        name = Information.data(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.title1:
                        Toast.makeText(new3.this, "dddddd", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.title2:
                        Toast.makeText(new3.this, "sssss", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.title3:
                        Toast.makeText(new3.this, "dshdhtd", Toast.LENGTH_SHORT).show();


                        break;
                    case R.id.title4:
                        Toast.makeText(new3.this, "ggggg", Toast.LENGTH_SHORT).show();

                        break;
                }
                return true;

            }
        });
    }

    @Override
    public void action(int position) {

    }


}
