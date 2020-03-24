package com.teknokratmobile2019ti17b17313024oneforall;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list_view extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView =findViewById(R.id.listview);
        final ArrayList<String>fruits= new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,fruits);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"you milih "+fruits.get(position),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
