package com.rubahapi.moviedb

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rubahapi.moviedb.adapters.MovieAdapter
import com.rubahapi.moviedb.models.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataName = resources.getStringArray(R.array.movie_name)
        val dataDescription = resources.getStringArray(R.array.movie_description)
        val dataImage = resources.obtainTypedArray(R.array.image_photo)


        val movieObjData = arrayListOf<Movie>()
        for (i in 0 until dataName.size-1){
            movieObjData.add(Movie(dataName[i], dataDescription[i], dataImage.getResourceId(i, -1)))
        }

        val adapter = MovieAdapter(this, movieObjData)
        list_movie.adapter = adapter

        list_movie.setOnItemClickListener{
            _, _, position, _ ->
            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra(DetailMovieActivity.EXTRA_DETAIL_MOVIE, movieObjData[position])
            startActivity(intent)
        }
    }
}
