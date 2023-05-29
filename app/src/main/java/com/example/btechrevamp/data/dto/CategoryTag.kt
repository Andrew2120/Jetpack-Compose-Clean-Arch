package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CategoryTag(
    @SerialName("color_code")
    val colorCode: String,
    @SerialName("tag_name")
    val tagName: String
)