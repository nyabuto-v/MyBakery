package com.nyabuto.mybakery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindBakeriesButton;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindBakeriesButton = (Button)findViewById(R.id.findBakeriesButton);
        mFindBakeriesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, BakeriesActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
