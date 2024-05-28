package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class LikeDislike(
    @SerializedName("dislike")
    val dislike: Int,
    @SerializedName("is_favourite")
    val isFavourite: Int,
    @SerializedName("like")
    val like: Int
)