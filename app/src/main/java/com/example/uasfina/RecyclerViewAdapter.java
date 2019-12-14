package com.example.uasfina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList <resep> list_resep;
    private Context context;

    public RecyclerViewAdapter(ArrayList<resep> list_resep, Context context) {
        this.list_resep = list_resep;
        this.context = context;
    }

    public ArrayList<resep> getList_resep() {return list_resep; }

    public void setlist_resep(ArrayList<resep> list_resep) {
        this.list_resep = list_resep;
    }

    @NotNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_daftarmakanan,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        final resep resep = list_resep.get(position);
        String judul = resep.getStrMeal();
        String image = resep.getStrMealThumb();

        holder.title.setText(judul);
        Glide.with(context)
                .asBitmap()
                .load(resep.getUrlgambar())
                .into(holder.show_image);
    }

    @Override
    public int getItemCount() {
        return list_resep.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, short_desc;
        private ImageView show_image;
        private CardView mylayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.judul);
            show_image = itemView.findViewById(R.id.gambar);
            mylayout = itemView.findViewById(R.id.card);
            mylayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
