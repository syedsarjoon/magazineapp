package com.example.eflipmagazine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //Init Variable
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    };

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

