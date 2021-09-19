package com.appsinventiv.covpass.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.CommonUtils;
import com.appsinventiv.covpass.Utils.SharedPrefs;
import com.chaos.view.PinView;

public class LoginPin extends AppCompatActivity {

    PinView loginPin;
    Button loginNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pin);

        loginPin = findViewById(R.id.loginPin);
        loginPin.requestFocus();

        loginNow = findViewById(R.id.loginNow);

        loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loginPin.getText().length() < 4) {
                    CommonUtils.showToast("Please enter correct pin");

                } else {
                    if (SharedPrefs.getPin().equalsIgnoreCase(loginPin.getText().toString())) {
                        SharedPrefs.setPin(loginPin.getText().toString());
                        Intent i = new Intent(LoginPin.this, MainActivity.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(i);
                        finish();
                    } else {
                        CommonUtils.showToast("Wrong pin entered");
                    }
                }
            }
        });


    }


}
