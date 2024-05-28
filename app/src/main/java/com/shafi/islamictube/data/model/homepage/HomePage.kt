package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class HomePage(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String
)