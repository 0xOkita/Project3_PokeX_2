package com.khoa.project3_pokex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {
    Button btn_pokedex, btn_ichooseyou, btn_trainning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        btn_pokedex = (Button)findViewById(R.id.button);
        btn_ichooseyou = (Button)findViewById(R.id.button2);
        btn_trainning = (Button) findViewById(R.id.button3);

        btn_pokedex.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, MainScreen.class);
                startActivity(intent);
            }
        });

    }




}
