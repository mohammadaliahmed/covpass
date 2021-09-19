package com.appsinventiv.covpass.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.SharedPrefs;

public class UserProfile extends AppCompatActivity {

    TextView username, name, capsName, dob;
    Button qrcode;
    TextView secondInjDate, firstInjDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        this.setTitle("");
        username = findViewById(R.id.username);
        name = findViewById(R.id.name);
        qrcode = findViewById(R.id.qrcode);
        capsName = findViewById(R.id.capsName);
        dob = findViewById(R.id.dob);
        secondInjDate = findViewById(R.id.secondInjDate);
        firstInjDate = findViewById(R.id.firstInjDate);


        firstInjDate.setText(SharedPrefs.getUser().getFirstinjday() + "." + SharedPrefs.getUser().getFirstinjmonth() + "." + SharedPrefs.getUser().getFirstinjyear());
        secondInjDate.setText(SharedPrefs.getUser().getSecondinjday() + "." + SharedPrefs.getUser().getSecondinjmonth() + "." + SharedPrefs.getUser().getSecondinjyear());

        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        capsName.setText(SharedPrefs.getUser().getLastname().toUpperCase() + ", " + SharedPrefs.getUser().getFirstname().toUpperCase());
        name.setText(SharedPrefs.getUser().getLastname() + ", " + SharedPrefs.getUser().getFirstname());
        username.setText(SharedPrefs.getUser().getFirstname() + " " + SharedPrefs.getUser().getLastname());
        dob.setText(SharedPrefs.getUser().getDobyear() + "-" + SharedPrefs.getUser().getDobmonth() + "-" + SharedPrefs.getUser().getDobday());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
