package com.teknokratmobile2019ti17b17313024oneforall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class whatsapp extends AppCompatActivity {
Intent intent = null, chooser=null;

@Override
 protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_whatsapp);

              Button buttonplayStore = findViewById(R.id.launch_whatsapp);

              buttonplayStore.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {

               	                intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                         chooser=Intent.createChooser(intent,"launch WhatsApp");
                               startActivity(chooser);
                            }
        });
            }
    public void home (View view){
        Intent home = new Intent(whatsapp.this,home.class);
        startActivity(home);
    }
	}