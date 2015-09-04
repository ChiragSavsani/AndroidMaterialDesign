package com.example.androidmaterialdesign.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.example.androidmaterialdesign.R;

/**
 * Created by chirag.savsani on 8/21/2015.
 */
public class InnerActivity extends ActionBarActivity {


    Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_activity);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


    }
}
