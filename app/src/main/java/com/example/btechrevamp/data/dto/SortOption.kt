package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SortOption(
    @SerialName("code")
    val code: String,
    @SerialName("is_default")
    val isDefault: Boolean,
    @SerialName("label")
    val label: String
)