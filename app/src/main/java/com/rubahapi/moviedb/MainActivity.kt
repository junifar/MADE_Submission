package com.rubahapi.moviedb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.rubahapi.moviedb.adapters.MovieAdapter
import com.rubahapi.moviedb.models.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieData = arrayOf(
            "A Star", "Aquaman",
            "Avenger Infinity War", "Birdbox",
            "Bohemian", "Bumblebee",
            "Creed", "Deadpool",
            "Dragon", "Dragonball",
            "Glass", "Hunterkiller",
            "Marry Popins")

        val movieObjData = arrayListOf<Movie>()
        movieObjData.add(Movie("Naruto", "shippudden"))
        movieObjData.add(Movie("Naruto1", "shippudden"))
        movieObjData.add(Movie("Naruto2", "shippudden"))

        val adapter = MovieAdapter(this, movieObjData)
//        val adapter = ArrayAdapter(this, android.R.layout.list_item, android.R.id.text1, movieData)
        list_movie.adapter = adapter

        list_movie.setOnItemClickListener{
            _, _, position, _ ->
            Toast.makeText(applicationContext, position.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
