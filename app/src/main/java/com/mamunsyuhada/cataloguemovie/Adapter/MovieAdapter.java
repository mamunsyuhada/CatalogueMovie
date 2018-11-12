package com.mamunsyuhada.cataloguemovie.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mamunsyuhada.cataloguemovie.R;
import com.mamunsyuhada.cataloguemovie.Response.Response;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final Context context;
    private ArrayList<Response> listResponse;

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rvMovie = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_catalogue,viewGroup,false);
        return new MovieViewHolder(rvMovie);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder movieViewHolder, int i) {
        final Response response = getListResponse().get(i);

        movieViewHolder.tvTitle.setText(response.getResults().toString());


    }

    @Override
    public int getItemCount() {
        return getListResponse().size();
    }

    private ArrayList<Response> getListResponse() {
        return listResponse;
    }

    public void setListResponse(ArrayList<Response> listResponse) {
        this.listResponse = listResponse;
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {

        RecyclerView rvLay;
        TextView tvTitle;
        TextView tvDesc;
        TextView tvDate;
        TextView tvRate;
        ImageView imgPoster;

        MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            rvLay = itemView.findViewById(R.id.itemRV);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvRate = itemView.findViewById(R.id.tvRate);
            imgPoster = itemView.findViewById(R.id.imgCatalogue);
        }
    }
}
