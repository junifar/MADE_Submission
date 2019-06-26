package com.rubahapi.moviedb.adapters

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rubahapi.moviedb.R
import com.rubahapi.moviedb.models.Movie
import org.w3c.dom.Text
import java.net.URI

class MovieAdapter(context: Context, private val movies:ArrayList<Movie>): BaseAdapter() {

    private val inflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    private class MovieViewHolder(view: View){
        internal var name: TextView = view.findViewById(R.id.listview_item_title)
        internal var description: TextView = view.findViewById(R.id.listview_item_short_description)
        internal var image_logo: ImageView = view.findViewById(R.id.image_logo)

        fun bind(movie: Movie){
            name.text = movie.name
            description.text = movie.description
            image_logo.setImageResource(movie.image_uri)
        }
    }

    override fun getView(i: Int, view: View?, parent: ViewGroup): View {
        val viewLocal:View

        if (view == null) {
            viewLocal = inflater.inflate(R.layout.list_item_image_two_lines, parent, false)
        }else{
            viewLocal = view
        }

        val holder = MovieViewHolder(viewLocal)
        val movie = getItem(i) as Movie
        holder.bind(movie)
        return viewLocal
    }

    override fun getItem(i: Int): Any = movies[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = movies.size
}

