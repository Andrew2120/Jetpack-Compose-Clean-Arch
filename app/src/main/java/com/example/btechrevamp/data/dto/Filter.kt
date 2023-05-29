package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Filter(
    @SerialName("code")
    val code: String,
    @SerialName("filter_options")
    val filterOptions: List<FilterOption>,
    @SerialName("id")
    val id: Int,
    @SerialName("is_swatch")
    val isSwatch: Boolean,
    @SerialName("label")
    val label: String,
    @SerialName("position")
    val position: Int
)