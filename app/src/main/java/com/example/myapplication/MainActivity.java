package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.IOException;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private LocalWebServer webServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webServer = new LocalWebServer();
        try {
            webServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        if (webServer != null) {
            webServer.stop();
        }
        super.onDestroy();
    }
}

