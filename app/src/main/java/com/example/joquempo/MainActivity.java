package com.example.joquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button botaoEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    botaoEntrar = findViewById(R.id.btn_entrar);
        botaoEntrar.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        });

    }
}