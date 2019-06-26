package com.rubahapi.moviedb.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.rubahapi.moviedb.R
import com.rubahapi.moviedb.models.Movie
import org.w3c.dom.Text

class MovieAdapter(context: Context, private val movies:ArrayList<Movie>): BaseAdapter() {

    private val inflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    private class MovieViewHolder{
        internal var name: TextView? = null
        internal var description: TextView? = null
    }

    override fun getView(i: Int, view: View?, parent: ViewGroup): View {

        val viewLocal:View
        val holder:MovieViewHolder

        if (view == null) {
            viewLocal = inflater.inflate(R.layout.list_item_image_two_lines, parent, false)

            holder = MovieViewHolder()
            holder.name = viewLocal.findViewById(R.id.listview_item_title) as TextView
            holder.description = viewLocal.findViewById(R.id.listview_item_short_description) as TextView
            viewLocal.tag = holder
        }else{
            viewLocal = view
            holder = viewLocal.tag as MovieViewHolder
        }

        val name        = holder.name
        val description = holder.description

        val movie = getItem(i) as Movie

        name?.text  = movie.name
        description?.text = movie.description

        return viewLocal
    }

    override fun getItem(i: Int): Any = movies[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = movies.size
}

