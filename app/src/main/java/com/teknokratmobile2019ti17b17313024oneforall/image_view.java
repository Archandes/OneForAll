package com.teknokratmobile2019ti17b17313024oneforall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class image_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
    }
    public void Home (View view){
        Intent home = new Intent(image_view.this,home.class);
        startActivity(home);
    }
}
