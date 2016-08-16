package com.example.givemepass.bottomtablayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.design.widget.TabLayout mTabs = (android.support.design.widget.TabLayout) findViewById(R.id.tabs);
        TabLayout.Tab tab1 = mTabs.newTab().setText("tab1");
        TabLayout.Tab tab2 = mTabs.newTab().setText("tab2");
        TabLayout.Tab tab3 = mTabs.newTab().setText("tab3");
        mTabs.addTab(tab1);
        mTabs.addTab(tab2);
        mTabs.addTab(tab3);
    }
}
