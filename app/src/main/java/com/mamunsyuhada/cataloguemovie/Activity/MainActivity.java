package com.mamunsyuhada.cataloguemovie.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.mamunsyuhada.cataloguemovie.Adapter.MovieAdapter;
import com.mamunsyuhada.cataloguemovie.R;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    private RecyclerView rvMovie;
    private EditText etSearch;

    public String mQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSearch = findViewById(R.id.etSearch);
        mQuery = etSearch.getText().toString();
    }


    public void btnSearch(View view) {

        movieAdapter = new MovieAdapter(this);
        rvMovie = findViewById(R.id.itemRV);
        rvMovie.setHasFixedSize(true);
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        rvMovie.setAdapter(movieAdapter);


        if (TextUtils.isEmpty(mQuery)) {
            etSearch.setError("Put Key Word");
        }

        else {
//            TODO akses end point theDbMovie Service nya
        }
    }
}
