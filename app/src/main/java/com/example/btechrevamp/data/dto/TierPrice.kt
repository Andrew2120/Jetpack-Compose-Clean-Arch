package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TierPrice(
    @SerialName("customer_group_id")
    val customerGroupId: String,
    @SerialName("extension_attributes")
    val extensionAttributes: ExtensionAttributes,
    @SerialName("qty")
    val qty: String,
    @SerialName("value")
    val value: String
)