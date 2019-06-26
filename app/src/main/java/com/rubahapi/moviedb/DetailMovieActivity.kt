package com.rubahapi.moviedb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rubahapi.moviedb.models.Movie
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {

    companion object{
        val EXTRA_DETAIL_MOVIE = "DetailMovies"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val movie = intent.getParcelableExtra<Movie>(EXTRA_DETAIL_MOVIE)
        image_logo.setImageResource(movie.image_uri)
        textMovieName.text = movie.name
        textViewDescription.text = movie.description
    }
}
