package com.example.eflipmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class social_page extends AppCompatActivity {
    ImageView insta,fb,blogger,html,linkedin,kindle,youtube,twitter;
GridLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_page);

        insta = findViewById(R.id.insta);
        fb = findViewById(R.id.fb);
        blogger = findViewById(R.id.blogger);
        html = findViewById(R.id.html);
        linkedin = findViewById(R.id.linkedin);
        kindle = findViewById(R.id.kindle);
        youtube = findViewById(R.id.youtube);
        twitter = findViewById(R.id.twitter);
        layout = findViewById(R.id.grid_lay);

insta.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String url = "https://www.instagram.com/eflipmagazine/?hl=en";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
});

fb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String url ="https://www.facebook.com/eflip.mappingtechnology.7";
        Intent i2 = new Intent(Intent.ACTION_VIEW);
        i2.setData(Uri.parse(url));
        startActivity(i2);
    }
});

blogger.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String url = "https://eflipmagazine.blogspot.com/";
        Intent i3 = new Intent(Intent.ACTION_VIEW);
        i3.setData(Uri.parse(url));
        startActivity(i3);
    }
});

html.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String url ="https://fliphtml5.com/bookcase/ibsnt";
        Intent i4 = new Intent(Intent.ACTION_VIEW);
        i4.setData(Uri.parse(url));
        startActivity(i4);
    }
});
       kindle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String url = "https://www.amazon.in/s?k=eflip+magazine&ref=nb_sb_noss";
               Intent i5 =new Intent(Intent.ACTION_VIEW);
               i5.setData(Uri.parse(url));
               startActivity(i5);
           }
       });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/company/e-flipmagazine/";
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url));
                startActivity(i5);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/eflipmagazine";
                Intent i6 =new Intent(Intent.ACTION_VIEW);
                i6.setData(Uri.parse(url));
                startActivity(i6);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UCgwOwe2o5necuJq7NGw0bug";
                Intent i6 =new Intent(Intent.ACTION_VIEW);
                i6.setData(Uri.parse(url));
                startActivity(i6);
            }
        });

    }
}
