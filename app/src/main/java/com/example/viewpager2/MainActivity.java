package com.example.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpMoviesViewPager();
    }


    private void setUpMoviesViewPager(){

        ViewPager2 movieViewPager = findViewById(R.id.moviesViewPager);
        movieViewPager.setClipToPadding(false);
        movieViewPager.setClipChildren(false);
        movieViewPager.setOffscreenPageLimit(3);
        movieViewPager.setClickable(true);
        movieViewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
//        compositePageTransformer.addTransformer((page, position) ->{
//            float r = 1 - Math.abs(position);
//           page.setScaleY(0.35f + r + 0.5f);
//        });
        movieViewPager.setPageTransformer(compositePageTransformer);
        movieViewPager.setAdapter(new MovieAdapter(getMovie()));
    }

    private List<Movie> getMovie(){

        List<Movie> movies = new ArrayList<>();

        Movie passenger = new Movie();
        passenger.poster = R.drawable.owl;
        passenger.category = "WidLife";
        passenger.name = "Owl";
        passenger.releaseDate = "December 20, 2022";
        passenger.rating = 3f;
        movies.add(passenger);

        Movie theFox = new Movie();
        theFox.poster = R.drawable.fox;
        theFox.name = "fox";
        theFox.category = "WildLife";
        theFox.releaseDate = "November 23, 2012";
        theFox.rating = 4.7f;
        movies.add(theFox);

        Movie thePanda = new Movie();
        thePanda.poster = R.drawable.redpanda;
        thePanda.name = "Red Panda";
        thePanda.category = " WildLife";
        thePanda.releaseDate = "August 26, 2016";
        thePanda.rating = 5;

        Movie theWinterFox = new Movie();
        theWinterFox.poster = R.drawable.winterfox;
        theWinterFox.name = "WinterFox";
        theWinterFox.category = "WildLife";
        theWinterFox.releaseDate = "February 26, 2020 ";
        theWinterFox.rating = 3.5f;
        movies.add(theWinterFox);

        Movie theWolf = new Movie();
        theWolf.poster = R.drawable.wolf;
        theWolf.name = "White Fox";
        theWolf.category = "WildLife";
        theWolf.releaseDate = "January 21 , 2011";
        theWolf.rating = 3.9f;
        movies.add(theWolf);

        Movie theKingFisher = new Movie();
        theKingFisher.poster = R.drawable.kingfisher;
        theKingFisher.name = "KingFisher";
        theKingFisher.category = "WildLife";
        theKingFisher.releaseDate = "September 12, 2015";
        theKingFisher.rating = 4.1f;
        movies.add(theKingFisher);

        return movies;
    }
}