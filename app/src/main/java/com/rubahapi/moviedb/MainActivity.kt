package com.rubahapi.moviedb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
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

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, movieData)
        list_movie.adapter = adapter
    }
}
