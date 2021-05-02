package com.example.pedra_papel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        Intent itent = new Intent(getApplicationContext(), principal.class);
        startActivity(itent);
    }

    public void fechar (View view){
        Intent itent = new Intent(getApplicationContext(), fim.class);
        startActivity(itent);
    }
}