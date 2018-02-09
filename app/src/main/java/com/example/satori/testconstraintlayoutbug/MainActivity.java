package com.example.satori.testconstraintlayoutbug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Glide.with(this).load("https://homepages.cae.wisc.edu/~ece533/images/monarch.png").into(imageView);
    }
}
