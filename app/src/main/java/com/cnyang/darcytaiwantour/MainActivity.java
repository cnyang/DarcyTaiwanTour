package com.cnyang.darcytaiwantour;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            initializePortrait();
        } else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            initializeLandscape();
        } else {
            initializePortrait();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            initializePortrait();
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            initializeLandscape();
        }
    }

    private void initializePortrait(){
        setContentView(R.layout.activity_main);
        ImageButton imgBtn_Day1 = (ImageButton) findViewById(R.id.imgBtn_Day1);
        ImageButton imgBtn_Day2 = (ImageButton) findViewById(R.id.imgBtn_Day2);
        ImageButton imgBtn_Day3 = (ImageButton) findViewById(R.id.imgBtn_Day3);
        ImageButton imgBtn_Day4 = (ImageButton) findViewById(R.id.imgBtn_Day4);
        ImageButton imgBtn_Day5 = (ImageButton) findViewById(R.id.imgBtn_Day5);
        ImageButton imgBtn_Day6 = (ImageButton) findViewById(R.id.imgBtn_Day6);


        imgBtn_Day1.setOnClickListener(new ImgBtn_Listener(this, 1));
        imgBtn_Day2.setOnClickListener(new ImgBtn_Listener(this, 2));
        imgBtn_Day3.setOnClickListener(new ImgBtn_Listener(this, 3));
        imgBtn_Day4.setOnClickListener(new ImgBtn_Listener(this, 4));
        imgBtn_Day5.setOnClickListener(new ImgBtn_Listener(this, 5));
        imgBtn_Day6.setOnClickListener(new ImgBtn_Listener(this, 6));
    }

    private void initializeLandscape(){
        setContentView(R.layout.activity_main_land);
        TextView txt_D0824 = (TextView) findViewById(R.id.txt_D0824);
        TextView txt_D0825 = (TextView) findViewById(R.id.txt_D0825);
        TextView txt_D0826 = (TextView) findViewById(R.id.txt_D0826);
        TextView txt_D0827 = (TextView) findViewById(R.id.txt_D0827);
        TextView txt_D0828 = (TextView) findViewById(R.id.txt_D0828);
        TextView txt_D0829 = (TextView) findViewById(R.id.txt_D0829);

        txt_D0824.setOnClickListener(new ImgBtn_Listener(this, 1));
        txt_D0825.setOnClickListener(new ImgBtn_Listener(this, 2));
        txt_D0826.setOnClickListener(new ImgBtn_Listener(this, 3));
        txt_D0827.setOnClickListener(new ImgBtn_Listener(this, 4));
        txt_D0828.setOnClickListener(new ImgBtn_Listener(this, 5));
        txt_D0829.setOnClickListener(new ImgBtn_Listener(this, 6));

    }
}

class ImgBtn_Listener implements View.OnClickListener {
    private MainActivity _activity;
    private int _day;
    public ImgBtn_Listener(MainActivity activity, int day) {
        this._activity = activity;
        _day=day;
    }
    @Override
    public void onClick(View v) {
        Intent i = new Intent(_activity, GalleryActivity.class);
        Bundle b = new Bundle();
        b.putInt("day", _day);
        i.putExtras(b);
        _activity.startActivity(i);
    }
}
