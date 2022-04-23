package com.example.devtest_stephanrodrigoscharantelo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.devtest_stephanrodrigoscharantelo.Activity.CountryDetailActivity;
import com.example.devtest_stephanrodrigoscharantelo.Json.CountryJson;
import com.example.devtest_stephanrodrigoscharantelo.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter <CountryAdapter.ViewHolderCountry>
{
    Context context;
    private List<CountryJson> countries;

    public CountryAdapter(List<CountryJson> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }
    @NonNull
    @Override
    public CountryAdapter.ViewHolderCountry onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_country, null, false);
        return new ViewHolderCountry(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolderCountry holder, int position) {
        holder.tv_name.setText(countries.get(position).getName());
        holder.tv_capital.setText(countries.get(position).getCapital());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CountryDetailActivity.class);
                intent.putExtra("name", countries.get(position).getName().toString());
                intent.putExtra("capital", countries.get(position).getCapital().toString());
                intent.putExtra("area", countries.get(position).getArea().toString());
                intent.putExtra("population", countries.get(position).getPopulation().toString());

                context.startActivity(intent);

            }
        });
        String img = countries.get(position).getFlags().getPng();
        /*Bitmap miimage = null;
        try {
            InputStream in = new URL(img).openStream();
            miimage = BitmapFactory.decodeStream(in);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        holder.iv_flag.setImageBitmap(miimage);*/
        //holder.iv_flag
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolderCountry extends RecyclerView.ViewHolder {

        public TextView tv_name, tv_capital;
        public ImageView iv_flag;

        public ViewHolderCountry(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_capital = itemView.findViewById(R.id.tv_capital);
            iv_flag = itemView.findViewById(R.id.iv_flag);
        }
    }
}
