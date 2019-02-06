package com.isleculture.isleculture;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.Locale;

public class IntroActivity extends AppCompatActivity {

    private Typeface titleTypeface;
    private AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        assetManager = getApplicationContext().getAssets();
        titleTypeface = Typeface.createFromAsset(assetManager,
                String.format(Locale.US, "fonts/%s", "FiraSans-SemiBold.ttf"));
        if(getSupportActionBar()!=null) getSupportActionBar().setTitle("");


    }
}
