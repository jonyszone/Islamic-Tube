package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class SliderMovy(
    @SerializedName("cover")
    val cover: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("play_mode")
    val playMode: String,
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("thumbnail")
    val thumbnail: String
)