package com.teknokratmobile2019ti17b17313024oneforall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void ViewPager (View view){
        Intent ViewPager = new Intent(home.this,view_pager.class);
        startActivity(ViewPager);
    }
    public void ListView (View view){
        Intent ListView = new Intent(home.this,list_view.class);
        startActivity(ListView);
    }
    public void WebView (View view){
        Intent WebView = new Intent(home.this,web_view.class);
        startActivity(WebView);
    }
    public void Animasi (View view){
        Intent animasi = new Intent(home.this,animasi.class);
        startActivity(animasi);
    }
    public void Image (View view){
        Intent image = new Intent(home.this,image_view.class);
        startActivity(image);
    }
    public void WA (View view){
        Intent wa = new Intent(home.this,whatsapp.class);
        startActivity(wa);
    }
}
