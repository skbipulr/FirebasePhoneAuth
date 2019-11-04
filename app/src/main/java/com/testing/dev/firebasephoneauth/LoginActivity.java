package com.testing.dev.firebasephoneauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText phoneET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phoneET = findViewById(R.id.phoneET);
    }

    public void nextButton(View view) {

        String phone= phoneET.getText().toString();
        startActivity(new Intent(LoginActivity.this,VerifyActivity.class).putExtra("phone",phone));
    }






}
