package com.appsinventiv.covpass.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.CommonUtils;
import com.appsinventiv.covpass.Utils.SharedPrefs;

public class CheckValidity extends AppCompatActivity {

    TextView name,dateTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_validity);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        this.setTitle("");
        dateTime=findViewById(R.id.dateTime);
        name=findViewById(R.id.name);
        name.setText(SharedPrefs.getUser().getFirstname()+" "+SharedPrefs.getUser().getLastname());
        dateTime.setText(CommonUtils.getFormattedDate(System.currentTimeMillis()));

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
