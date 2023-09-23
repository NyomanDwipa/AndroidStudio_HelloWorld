package com.nyomandwipa.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("NyomanDwipa") && password.getText().toString().equals("73022155F")) {
                    Toast.makeText(MainActivity.this, "Login Sukses!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText( MainActivity.this, "Login Gagal!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}