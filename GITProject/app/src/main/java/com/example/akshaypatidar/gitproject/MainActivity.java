package com.example.akshaypatidar.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewCenterText=(TextView)findViewById(R.id.textViewCenterText);
        textViewCenterText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                performClickForMaster();
            }
        });
    }

    public void performClickForMaster()
    {
        Toast.makeText(MainActivity.this,"You are in Master",Toast.LENGTH_LONG).show();
    }

}

