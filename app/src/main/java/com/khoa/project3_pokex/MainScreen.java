package com.khoa.project3_pokex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn_fire, btn_water, btn_ground, btn_electric, btn_ice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        btn_fire = (ImageButton)findViewById(R.id.imageButton_type_fire);
        btn_electric = (ImageButton)findViewById(R.id.imageButton_type_electric);
        btn_ground = (ImageButton)findViewById(R.id.imageButton_type_ground);
        btn_ice = (ImageButton)findViewById(R.id.imageButton_type_ice);
        btn_water = (ImageButton)findViewById(R.id.imageButton_type_water);
        btn_fire.setOnClickListener(this);
        btn_electric.setOnClickListener(this);
        btn_ground.setOnClickListener(this);
        btn_ice.setOnClickListener(this);
        btn_water.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton_type_fire:
                Intent intent1 = new Intent(this, ListPokemonScreen.class);
                intent1.putExtra("type", "fire");
                startActivity(intent1);
                break;
            case R.id.imageButton_type_water:
                Intent intent2 = new Intent(this, ListPokemonScreen.class);
                intent2.putExtra("type", "water");
                startActivity(intent2);
                break;
            case R.id.imageButton_type_ground:
                Intent intent3 = new Intent(this, ListPokemonScreen.class);
                intent3.putExtra("type", "ground");
                startActivity(intent3);
                break;
            case R.id.imageButton_type_ice:
                Intent intent4 = new Intent(this, ListPokemonScreen.class);
                intent4.putExtra("type", "ice");
                startActivity(intent4);
                break;
            case R.id.imageButton_type_electric:
                Intent intent5 = new Intent(this, ListPokemonScreen.class);
                intent5.putExtra("type", "electric");
                startActivity(intent5);
                break;
        }
    }
}
