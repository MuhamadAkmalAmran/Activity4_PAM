package com.example.activity1apam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edEmail, edPassword;
    Button okBtn;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail = (EditText) findViewById(R.id.edEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        okBtn = (Button) findViewById(R.id.btSignin);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = edEmail.getText().toString();
                password = edPassword.getText().toString();

                if (email.equals("email") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

                } else if (email != ("email") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();

                } else if (email.equals("email") && password != ("123")) {
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (email != ("email") && password != ("123")) {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}