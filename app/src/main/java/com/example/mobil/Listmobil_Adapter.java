package com.example.mobil;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Listmobil_Adapter extends RecyclerView.Adapter<Listmobil_Adapter.ListViewHolder>  {
     public ListViewHolder(@NonNull View itemView) {
         ImageView imgPhoto;
         TextView tvName, tvDetail;
}
    @NonNull
    @Override
    public Listmobil_AdaptorAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Listmobil_Adapter.ListViewHolder holder, int position) {
        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
