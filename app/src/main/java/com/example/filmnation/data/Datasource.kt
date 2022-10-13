package com.example.filmnation.data

import com.example.filmnation.R
import com.example.filmnation.model.FilmNation

class Datasource {
    fun loadFilmNation(): List<FilmNation> {
        return listOf<FilmNation>(
            FilmNation(R.string.film1, R.drawable.the_invisible_guest),
            FilmNation(R.string.film2, R.drawable.gone_girl),
            FilmNation(R.string.film3, R.drawable.who_am_i),
            FilmNation(R.string.film4, R.drawable.exam),
            FilmNation(R.string.film5, R.drawable.bad_genius),
            FilmNation(R.string.film6, R.drawable.searching),
            FilmNation(R.string.film7, R.drawable.dont_breathe),
            FilmNation(R.string.film8, R.drawable.forrest_gump),
            FilmNation(R.string.film9, R.drawable.split),
            FilmNation(R.string.film10, R.drawable.the_lord_of_the_ring)
        )
    }
}