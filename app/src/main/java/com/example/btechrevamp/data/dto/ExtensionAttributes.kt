package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtensionAttributes(
    @SerialName("website_id")
    val websiteId: String
)