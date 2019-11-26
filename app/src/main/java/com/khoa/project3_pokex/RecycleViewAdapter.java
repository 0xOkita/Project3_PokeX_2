package com.khoa.project3_pokex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Pokemon> mData ;


    public RecycleViewAdapter(Context mContext, List<Pokemon> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_pokemon,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.name.setText(mData.get(position).getName());
        holder.img_pokemon_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,DescriptionPokemon.class);

                // passing data to the book activity
                intent.putExtra("name",mData.get(position).getName());
                intent.putExtra("id",mData.get(position).getId());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView img_pokemon_thumbnail;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.pokemon_title_id) ;
            img_pokemon_thumbnail = (ImageView) itemView.findViewById(R.id.pokemon_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }


}