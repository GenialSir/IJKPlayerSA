package com.genialsir.ijkplayersa;


import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends Activity {
    private String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoPath = Environment.getExternalStorageDirectory() + "/AVideo/chengdu.mp4";
        final String videoTitle = "Video Title";
        Button btnEnter = (Button) findViewById(R.id.btn_enter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoActivity.intentTo(MainActivity.this,
                        videoPath,
                        videoTitle);
//                VideoActivity.intentTo(MainActivity.this,
//                        "http://devimages.apple.com.edgekey.net/streaming/examples/bipbop_4x3/bipbop_4x3_variant.m3u8",
//                        "bipbop basic master playlist");
            }
        });
    }

}
