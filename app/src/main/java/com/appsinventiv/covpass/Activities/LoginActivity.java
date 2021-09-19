package com.appsinventiv.covpass.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.appsinventiv.covpass.Models.User;
import com.appsinventiv.covpass.R;
import com.appsinventiv.covpass.Utils.CommonUtils;
import com.appsinventiv.covpass.Utils.KeyboardUtils;
import com.appsinventiv.covpass.Utils.SharedPrefs;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    EditText firstname, lastname, dobday, dobmonth, dobyear, firstinjday, firstinjmonth, firstinjyear, secondinjday, secondinjmonth, secondinjyear;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        dobday = findViewById(R.id.dobday);
        dobmonth = findViewById(R.id.dobmonth);
        dobyear = findViewById(R.id.dobyear);
        firstinjday = findViewById(R.id.firstinjday);
        firstinjmonth = findViewById(R.id.firstinjmonth);
        firstinjyear = findViewById(R.id.firstinjyear);
        secondinjday = findViewById(R.id.secondinjday);
        secondinjmonth = findViewById(R.id.secondinjmonth);
        secondinjyear = findViewById(R.id.secondinjyear);
        save = findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstname.getText().length() < 1) {
                    firstname.setError("Enter firstname");
                } else if (lastname.getText().length() < 1) {
                    lastname.setError("Enter lastname");
                } else if (dobday.getText().length() < 1) {
                    dobday.setError("Enter day");
                } else if (dobmonth.getText().length() < 1) {
                    dobmonth.setError("Enter month");
                } else if (dobyear.getText().length() < 1) {
                    dobyear.setError("Enter year");
                } else if (firstinjday.getText().length() < 1) {
                    firstinjday.setError("Enter day");
                } else if (firstinjmonth.getText().length() < 1) {
                    firstinjmonth.setError("Enter month");
                } else if (firstinjyear.getText().length() < 1) {
                    firstinjyear.setError("Enter year");
                } else if (secondinjday.getText().length() < 1) {
                    secondinjday.setError("Enter day");
                } else if (secondinjmonth.getText().length() < 1) {
                    secondinjmonth.setError("Enter month");
                } else if (secondinjyear.getText().length() < 1) {
                    secondinjyear.setError("Enter year");
                } else {
                    saveProfileNow();

                }
            }
        });


        dobday.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (dobday.getText().length() > 0) {
                        if (dobday.getText().length() < 2) {
                            dobday.setText("0" + dobday.getText().toString());

                        }
                        if (Integer.parseInt(dobday.getText().toString()) < 1 || Integer.parseInt(dobday.getText().toString()) > 31) {
                            dobday.setError("Enter correct day");
                        } else {
                            dobmonth.requestFocus();
                        }

                    } else {
                        dobday.setError("Enter day");
                    }
                    return true;
                }
                return false;
            }
        });
        dobmonth.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (dobmonth.getText().length() > 0) {
                        if (dobmonth.getText().length() < 2) {
                            dobmonth.setText("0" + dobmonth.getText().toString());

                        }
                        if (Integer.parseInt(dobmonth.getText().toString()) < 1 || Integer.parseInt(dobmonth.getText().toString()) > 12) {
                            dobmonth.setError("Enter correct month");
                        } else {
                            dobyear.requestFocus();
                        }
                    } else {
                        dobmonth.setError("Enter month");
                    }
                    return true;
                }
                return false;
            }
        });
        firstinjday.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (firstinjday.getText().length() > 0) {
                        if (firstinjday.getText().length() < 2) {
                            firstinjday.setText("0" + firstinjday.getText().toString());
                        }
                        if (Integer.parseInt(firstinjday.getText().toString()) < 1 || Integer.parseInt(firstinjday.getText().toString()) > 31) {
                            firstinjday.setError("Enter correct day");
                        } else {
                            firstinjmonth.requestFocus();
                        }
                    } else {
                        firstinjday.setError("Enter day");
                    }
                    return true;
                }
                return false;
            }
        });
        firstinjmonth.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (firstinjmonth.getText().length() > 0) {
                        if (firstinjmonth.getText().length() < 2) {
                            firstinjmonth.setText("0" + firstinjmonth.getText().toString());

                        }
                        if (Integer.parseInt(firstinjmonth.getText().toString()) < 1 || Integer.parseInt(firstinjmonth.getText().toString()) > 12) {
                            firstinjmonth.setError("Enter correct month");
                        } else {
                            firstinjyear.requestFocus();
                        }
                    } else {
                        firstinjmonth.setError("Enter month");
                    }
                    return true;
                }
                return false;
            }
        });
        secondinjday.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (secondinjday.getText().length() > 0) {
                        if (secondinjday.getText().length() < 2) {
                            secondinjday.setText("0" + secondinjday.getText().toString());
                        }
                        if ((Integer.parseInt(secondinjday.getText().toString()) < 1) || (Integer.parseInt(secondinjday.getText().toString()) > 31)) {
                            secondinjday.setError("Enter correct day");
                        } else {
                            secondinjmonth.requestFocus();
                        }
                    } else {
                        secondinjday.setError("Enter day");
                    }
                    return true;
                }
                return false;
            }
        });
        secondinjmonth.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (secondinjmonth.getText().length() > 0) {
                        if (secondinjmonth.getText().length() < 2) {
                            secondinjmonth.setText("0" + secondinjmonth.getText().toString());

                        }
                        if (Integer.parseInt(secondinjmonth.getText().toString()) < 1 || Integer.parseInt(secondinjmonth.getText().toString()) > 12) {
                            secondinjmonth.setError("Enter correct month");
                        } else {
                            secondinjyear.requestFocus();
                        }
                    } else {
                        secondinjmonth.setError("Enter month");
                    }
                    return true;
                }
                return false;
            }
        });
        dobyear.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (dobyear.getText().length() > 0) {
                        if (Integer.parseInt(dobyear.getText().toString()) > 1900 && Integer.parseInt(dobyear.getText().toString()) < 2022) {
                            firstinjday.requestFocus();
                        } else {
                            dobyear.setError("Please enter correct year");
                        }
                    } else {
                        dobyear.setError("Enter year");
                    }
                    return true;
                }
                return false;
            }
        });
        firstinjyear.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    //do here your stuff f
                    if (firstinjyear.getText().length() > 0) {
                        if (Integer.parseInt(firstinjyear.getText().toString()) > 1900 && Integer.parseInt(firstinjyear.getText().toString()) < 2022) {
                            secondinjday.requestFocus();
                        } else {
                            firstinjyear.setError("Please enter correct year");
                        }
                    } else {
                        firstinjyear.setError("Enter year");
                    }
                    return true;
                }
                return false;
            }
        });
        secondinjyear.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    //do here your stuff f
                    if (secondinjyear.getText().length() > 0) {
                        if (Integer.parseInt(secondinjyear.getText().toString()) > 1900 && Integer.parseInt(secondinjyear.getText().toString()) < 2022) {
                            KeyboardUtils.forceCloseKeyboard(secondinjyear);
                        } else {
                            secondinjyear.setError("Please enter correct year");
                        }
                    } else {
                        secondinjyear.setError("Enter year");
                    }
                    return true;
                }
                return false;
            }
        });


    }

    private void saveProfileNow() {
        User user = new User(
                firstname.getText().toString(),
                lastname.getText().toString(),
                dobday.getText().toString(),
                dobmonth.getText().toString(),
                dobyear.getText().toString(),
                firstinjday.getText().toString(),
                firstinjmonth.getText().toString(),
                firstinjyear.getText().toString(),
                secondinjday.getText().toString(),
                secondinjmonth.getText().toString(),
                secondinjyear.getText().toString()

        );
        SharedPrefs.setUser(user);
        Intent i = new Intent(LoginActivity.this, CreatePin.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        finish();
    }
}
