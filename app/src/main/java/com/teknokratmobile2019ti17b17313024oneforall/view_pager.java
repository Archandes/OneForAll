package com.teknokratmobile2019ti17b17313024oneforall;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class view_pager extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager   viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout =findViewById(R.id.tablayout);
        viewPager   =findViewById(R.id.viewpager);

        ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager());
        adapter.add(new chats(),"chats");
        adapter.add(new call(),"call");
        adapter.add(new online(),"online");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
