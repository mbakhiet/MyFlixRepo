package com.codepath.flixster;

import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by mbakhiet on 6/15/16.
 */
public class Movie {

    public String getTitle() {
        return title;
    }

    public String getPosterUrl() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterUrl);
    }

    public String getBackDropUrl() {
        return String.format("https://image.tmdb.org/t/p/w780/%s", backDropUrl);
    }

    public String getOverview() {
        return overview;
    }

    public String title;
    public String posterUrl;
    public String backDropUrl;
    public String overview;

    public Movie(JSONObject jsonObject) throws JSONException {
        this.posterUrl = jsonObject.getString("poster_path");
        this.title = jsonObject.getString("original_title");
        this.backDropUrl = jsonObject.getString("backdrop_path");
        this.overview = jsonObject.getString("overview");
    }

    public static ArrayList<Movie> fromJSONArray(JSONArray array) {

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < array.length(); i++) {
            try {
                movies.add(new Movie(array.getJSONObject(i)));
            }
            catch (JSONException e){
            }
        }
        return movies;
    }
}
