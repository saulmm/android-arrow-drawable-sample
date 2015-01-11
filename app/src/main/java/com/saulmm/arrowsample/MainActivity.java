package com.saulmm.arrowsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;

import static android.support.v7.app.ActionBarDrawerToggle.DrawerArrowDrawableToggle;


public class MainActivity extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener {

    private int counter;
    private DrawerArrowDrawableToggle drawerDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        ImageView imageView = (ImageView) findViewById(R.id.my_awesome_imageview);

        drawerDrawable = new DrawerArrowDrawableToggle(this, getSupportActionBar().getThemedContext());
        imageView.setImageDrawable(drawerDrawable);

        SeekBar seek = (SeekBar) findViewById(R.id.my_awesome_seekbar);
        seek.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        float mProgress = progress / 100f;
        Log.d("[DEBUG]", "MainActivity onProgressChanged - Progress: "+mProgress);
        drawerDrawable.setProgress(mProgress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
