package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class Movy(
    @SerializedName("content_id")
    val contentId: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("like_dislike")
    val likeDislike: LikeDislike,
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