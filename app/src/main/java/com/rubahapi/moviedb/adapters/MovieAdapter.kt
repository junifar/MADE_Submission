package com.rubahapi.moviedb.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.rubahapi.moviedb.models.Movie

class MovieAdapter(private val movies:ArrayList<Movie>): BaseAdapter() {

    lateinit var context:Context

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View? {
        return null
    }

    override fun getItem(i: Int): Any = movies[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = movies.size

}