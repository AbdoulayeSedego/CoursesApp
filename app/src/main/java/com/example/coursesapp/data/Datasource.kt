package com.example.coursesapp.data

import com.example.coursesapp.R
import com.example.coursesapp.model.Courses

class Datasource() {
    fun loadImages() : List<Courses> {
        return listOf<Courses>(
            Courses(R.string.architecture, R.drawable.architecture),
            Courses(R.string.business, R.drawable.business),
            Courses(R.string.crafts, R.drawable.crafts),
            Courses(R.string.design, R.drawable.design),
            Courses(R.string.culinary, R.drawable.culinary),
            Courses(R.string.drawing, R.drawable.drawing),
            Courses(R.string.fashion, R.drawable.fashion),
            Courses(R.string.film, R.drawable.film),
            Courses(R.string.gaming, R.drawable.gaming),
            Courses(R.string.tech, R.drawable.tech),
            Courses(R.string.photography, R.drawable.photography),
            Courses(R.string.painting, R.drawable.painting),
            Courses(R.string.music, R.drawable.music),
            Courses(R.string.lifestyle, R.drawable.lifestyle),

        )
    }
}
