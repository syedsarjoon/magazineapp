package com.example.eflipmagazine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //Init Variable
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;
    Button sub,cam,pub,Quiz,internship,ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub =findViewById(R.id.subcribe_btn);
        cam=findViewById(R.id.campuss_amb);
        pub=findViewById(R.id.publish_btn);
        Quiz=findViewById(R.id.quiz_btn);
        internship=findViewById(R.id.intern);
        ad=findViewById(R.id.ad_btn);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.eflipmagazine.com/subscribe";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.eflipmagazine.com/campusambassador";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.eflipmagazine.com/quiz";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.eflipmagazine.com/quiz";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        internship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.eflipmagazine.com/internships";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSep_jbka2omjz74PRMq142umHILmCudpRGoWfoSak71pl7elg/viewform";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Navigation coding start
        drawerLayout = findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView=findViewById(R.id.navigation_view);
        View navView = navigationView.inflateHeaderView(R.layout.navigation_header);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                UserMenuSelected(menuItem);
                return false;



            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))

            return true;

        return super.onOptionsItemSelected(item);
    }
    public void UserMenuSelected(MenuItem menuItem){
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    Intent intent = new Intent(this,MainActivity.class);
                    startActivity(intent);
                    break;

                case R.id.nav_About:
                    Intent intent1 = new Intent(this,About.class);
                    startActivity(intent1);
                    break;

                case R.id.nav_Editions:
                    Intent intent2 = new Intent(this,Editions.class);
                    startActivity(intent2);
                    break;

                case R.id.nav_ContactUs:
                    Intent intent3 = new Intent(this,Contactus.class);
                    startActivity(intent3);
                    break;
                case R.id.oursocialpage:
                    Intent intent4 = new Intent(this,social_page.class);
                    startActivity(intent4);
                    break;

        }}

}

