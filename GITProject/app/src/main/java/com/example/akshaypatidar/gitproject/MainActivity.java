package com.example.akshaypatidar.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private TextView textViewCenterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        //Test Today
        setContentView(R.layout.activity_main);


        textViewCenterText = (TextView) findViewById(R.id.textViewCenterText);
        textViewCenterText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textViewCenterText:
                Toast.makeText(MainActivity.this, "Hello ! This is branch code.", Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }

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
        Toast.makeText(MainActivity.this,"Hello ! You are in Master.",Toast.LENGTH_LONG).show();
    }

}

