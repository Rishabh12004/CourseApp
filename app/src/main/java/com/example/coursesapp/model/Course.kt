package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
    @StringRes val nameResourceId: Int,
    val numberResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
