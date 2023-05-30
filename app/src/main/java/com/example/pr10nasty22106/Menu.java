package com.example.pr10nasty22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn = findViewById(R.id.button14);
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, ShowItem.class);
        startActivity(intent);
    }
}