package com.jadedev.taller_api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.jadedev.covid_19.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CovidAdapter extends RecyclerView.Adapter<CovidAdapter.ViewHolder> {

    private Context context;
    private List<CountryCovid> list;

    public CovidAdapter(Context context, List<CountryCovid> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CountryCovid countryCovid = list.get(position);

        holder.countryName.setText("Pais: " + String.valueOf(countryCovid.getCountry()));
        //holder.countryCode.setText(String.valueOf(countryCovid.getCountry_code()));
        holder.latest.setText("Numero de Casos: " + String.valueOf(countryCovid.getLatest()));


        Picasso.get().load("https://www.countryflags.io/" + countryCovid.getCountry_code().toLowerCase() + "/flat/64.png").into(holder.countryFlag);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView countryName, countryCode, latest;
        public ImageView countryFlag;

        public ViewHolder(View itemView) {
            super(itemView);

            countryName = itemView.findViewById(R.id.main_country_name);
            latest = itemView.findViewById(R.id.main_latest);
            countryFlag = itemView.findViewById(R.id.main_country_image);

        }
    }

}