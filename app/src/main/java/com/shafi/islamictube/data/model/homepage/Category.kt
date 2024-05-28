package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)