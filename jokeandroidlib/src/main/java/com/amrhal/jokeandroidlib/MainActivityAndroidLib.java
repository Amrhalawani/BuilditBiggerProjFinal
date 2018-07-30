package com.amrhal.jokeandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityAndroidLib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_lib);

        TextView textView = findViewById(R.id.textview_androidlib);
        textView.setText(getIntent().getExtras().getString("joke"));

    }
}
