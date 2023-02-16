package com.example.appprac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AppPrac1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "App Created", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "This app is created");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GifActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "App Started", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "This app is started");
            }
        });
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(MainActivity.this, "App Stopped", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "This app is stopped");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "App Destroyed", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "This app is destroyed");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(MainActivity.this, "App Created", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "This app is paused");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(MainActivity.this, "App Resumed", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "This app is resumed");
    }

}