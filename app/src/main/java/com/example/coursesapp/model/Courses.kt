package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Courses(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int
)
