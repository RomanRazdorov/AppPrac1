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


}