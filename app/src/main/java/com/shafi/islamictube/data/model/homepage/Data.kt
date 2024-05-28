package com.shafi.islamictube.data.model.homepage


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("category")
    val category: Category,
    @SerializedName("slider_movies")
    val sliderMovies: List<SliderMovy>,
    @SerializedName("sub_category_and_movies")
    val subCategoryAndMovies: List<SubCategoryAndMovy>
)