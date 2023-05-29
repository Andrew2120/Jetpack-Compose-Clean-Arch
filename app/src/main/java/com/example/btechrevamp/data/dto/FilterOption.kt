package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FilterOption(
    @SerialName("color_code")
    val colorCode: String,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("is_minicash")
    val isMinicash: Boolean,
    @SerialName("label")
    val label: String,
    @SerialName("product_count")
    val productCount: Int
)