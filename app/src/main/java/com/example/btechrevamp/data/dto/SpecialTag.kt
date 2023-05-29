package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SpecialTag(
    @SerialName("code")
    val code: String,
    @SerialName("color_code")
    val colorCode: String,
    @SerialName("tag_name")
    val tagName: String
)