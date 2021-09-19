package com.appsinventiv.covpass.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.SharedPrefs;

public class MainActivity extends AppCompatActivity {

    TextView name;
    LinearLayout showCertificate,validity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCertificate = findViewById(R.id.showCertificate);
        validity = findViewById(R.id.validity);
        name = findViewById(R.id.name);
        name.setText(SharedPrefs.getUser().getFirstname() + " " + SharedPrefs.getUser().getLastname());
        showCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UserProfile.class));
            }
        });

        validity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CheckValidity.class));
            }
        });


    }
}
