package com.example.activity1apam;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_kedua extends AppCompatActivity {

    //mendeklarasikan variabel dengan tipe data texview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.textView3);

        //menghubungkan variabel txEmail dengan componen TextView pada layout
        txPassword = findViewById(R.id.textView5);

        //mendekalarasikan variabel bundle yang akan digunakan untuk mengambil
        //pesan yang dikirim melalui method intet
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari varibael email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari varibael email kedalam txPassword
        txPassword.setText(pass);
    }
}
