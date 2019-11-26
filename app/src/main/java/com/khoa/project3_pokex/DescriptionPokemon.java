package com.khoa.project3_pokex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionPokemon extends AppCompatActivity {
    TextView name, id, defense, type;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_pokemon);
        name = (TextView) findViewById(R.id.txtname);
        id = (TextView) findViewById(R.id.txtid);
        //defense = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String name1 = intent.getExtras().getString("name");
        String id1 = intent.getExtras().getString("id");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        name.setText(name1);
        id.setText(id1);
        img.setImageResource(image);
    }
}
