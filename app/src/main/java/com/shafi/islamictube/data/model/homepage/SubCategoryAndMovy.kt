package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class SubCategoryAndMovy(
    @SerializedName("movies")
    val movies: List<Movy>,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)