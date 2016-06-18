package com.codepath.flixster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

import com.codepath.flixster.R;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        String title = getIntent().getStringExtra("title");
        String overview = getIntent().getStringExtra("overview");
        String rating = getIntent().getStringExtra("rating");

        //EditText name = findViewById();
    }

}