package com.example.coursesapp.data

import com.example.coursesapp.R
import com.example.coursesapp.model.Course

class DataSource {
    fun loadDataSource1(): List<Course>{
        return listOf<Course>(
            Course(R.string.architecture, 58, R.drawable.architecture),
            Course(R.string.crafts, 121, R.drawable.crafts),
            Course(R.string.business, 78, R.drawable.business),
            Course(R.string.culinary, 118, R.drawable.culinary),
            Course(R.string.design, 423, R.drawable.design),
            Course(R.string.fashion, 92, R.drawable.fashion),
            Course(R.string.film, 165, R.drawable.film),
            Course(R.string.gaming, 164, R.drawable.ic_launcher_foreground),
            Course(R.string.drawing, 326, R.drawable.drawing),
            Course(R.string.lifestyle, 305, R.drawable.lifestyle),
            Course(R.string.music, 212, R.drawable.music),
            Course(R.string.painting, 172, R.drawable.painting),
            Course(R.string.photography, 321, R.drawable.photography),
            Course(R.string.tech, 118, R.drawable.tech),
            Course(R.string.automotive, 818, R.drawable.automotive),
            Course(R.string.engineering, 908, R.drawable.engineering),
            Course(R.string.finance, 668, R.drawable.finance),
            Course(R.string.ecology, 908, R.drawable.ecology),
            Course(R.string.biology, 818, R.drawable.biology),
            Course(R.string.geology, 232, R.drawable.geology),
            Course(R.string.history, 232, R.drawable.history),
            Course(R.string.journalism, 112, R.drawable.journalism),
            Course(R.string.law, 232, R.drawable.law),
            Course(R.string.physics, 772, R.drawable.physics),
        )
    }
}