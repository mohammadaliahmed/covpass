package com.appsinventiv.covpass.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.CommonUtils;
import com.appsinventiv.covpass.Utils.SharedPrefs;
import com.chaos.view.PinView;

public class CreatePin extends AppCompatActivity {

    PinView loginPin, confirmLoginPin;
    Button createPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pin);

        confirmLoginPin = findViewById(R.id.confirmLoginPin);
        createPin = findViewById(R.id.createPin);
        loginPin = findViewById(R.id.loginPin);
        loginPin.requestFocus();

        createPin = findViewById(R.id.createPin);

        createPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loginPin.getText().length() < 4) {
                    CommonUtils.showToast("Please enter correct pin");
                } else if (confirmLoginPin.getText().length() < 4) {
                    CommonUtils.showToast("Please enter correct pin");
                } else if (!confirmLoginPin.getText().toString().equals(loginPin.getText().toString())) {
                    CommonUtils.showToast("Pins does not match");
                } else {
                    savePin();
                }
            }
        });


    }

    private void savePin() {
        SharedPrefs.setPin(loginPin.getText().toString());
        Intent i = new Intent(CreatePin.this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        finish();
    }
}
