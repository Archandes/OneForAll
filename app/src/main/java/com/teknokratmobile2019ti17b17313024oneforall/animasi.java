package com.teknokratmobile2019ti17b17313024oneforall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class animasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animasi);
    }
    public void clockwise(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView2);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        image.startAnimation(animation1);
    }
    public void Home (View view){
        Intent Home = new Intent(animasi.this,home.class);
        startActivity(Home);
    }
}
