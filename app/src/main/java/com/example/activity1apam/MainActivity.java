package com.example.activity1apam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                //mengset email yg benar
                String email = "email";

                //mengset pass yg benar
                String pass = "123";

                if (email.equals(email) && password.equals(pass)) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari variabel nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("a", email.trim());

                    //memasukkan value dari variabel password dengan kunci "b"
                    // dan dimasukkan kedalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke Activitykedua
                    Intent i = new Intent(getApplicationContext(), Activity_kedua.class);

                    //memasukkan bundle kedalam intent untuk dikirim ke AcitivityKedua
                    i.putExtras(b);

                    //berpindah ke ActivityKedua
                    startActivity(i);

                } else if (email != (email) && password.equals(email)) {
                    Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();

                } else if (email.equals(email) && password != (pass)) {
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (email != (email) && password != (pass)) {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}