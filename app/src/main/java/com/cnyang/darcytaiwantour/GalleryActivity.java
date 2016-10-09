package com.cnyang.darcytaiwantour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class GalleryActivity extends AppCompatActivity {

    String[] tourDate = new String[]{"2015/08/24", "2015/08/25", "2015/08/26", "2015/08/27", "2015/08/28", "2015/08/29"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Bundle b = getIntent().getExtras();
        int day = -1;
        if(b != null)
            day = b.getInt("day");
        TextView caption = (TextView) findViewById(R.id.caption);
        caption.setText(tourDate[day-1]);
    }
}

