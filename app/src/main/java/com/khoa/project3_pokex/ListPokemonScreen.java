package com.khoa.project3_pokex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ListPokemonScreen extends AppCompatActivity {
    LinearLayout linearLayout;
    JSONObject obj;
    List<Pokemon> lstBook ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pokemon_screen);
        String selectedType = getIntent().getStringExtra("type");
        switch (selectedType){
            case "water":
                linearLayout = (LinearLayout)findViewById(R.id.background_list_pkm);
                linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(ListPokemonScreen.this, R.drawable.water_background) );
                break;
            case "fire":
                linearLayout = (LinearLayout)findViewById(R.id.background_list_pkm);
                linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(ListPokemonScreen.this, R.drawable.fire_background) );
                break;
            case "electric":
                linearLayout = (LinearLayout)findViewById(R.id.background_list_pkm);
                linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(ListPokemonScreen.this, R.drawable.electric_background) );
                break;
            case "ground":
                linearLayout = (LinearLayout)findViewById(R.id.background_list_pkm);
                linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(ListPokemonScreen.this, R.drawable.ground_background) );
                break;
            case "ice":
                linearLayout = (LinearLayout)findViewById(R.id.background_list_pkm);
                linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(ListPokemonScreen.this, R.drawable.ice_background) );
                break;
        }
        String myJson=inputStreamToString(this.getResources().openRawResource(R.raw.pokemon));
        try {

            obj = new JSONObject(myJson.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //JsonParser();

        lstBook = new ArrayList<>();
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.mewtwo));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.mewtwo));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));

        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.mewtwo));
        lstBook.add(new Pokemon("mewtow","1","2","psychic",1,R.drawable.alakazam));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }

    protected void JsonParser(){
        try {
            JSONArray jsonArray = obj.getJSONArray("pokemon");
            for(int i=0;i< jsonArray.length();i++){
                JSONObject pokemons = jsonArray.getJSONObject(i);
                String name, type, attack, defense;
                int id;
                name = pokemons.getString("name");
                type = pokemons.getString("type");
                attack = pokemons.getString("attack");
                defense = pokemons.getString("defense");
                id = pokemons.getInt("id");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    public String inputStreamToString(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            return null;
        }
    }
}
