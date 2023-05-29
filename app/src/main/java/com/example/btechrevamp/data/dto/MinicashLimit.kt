package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MinicashLimit(
    @SerialName("attribute_code")
    val attributeCode: String,
    @SerialName("credit_limit")
    val creditLimit: Int,
    @SerialName("label")
    val label: String,
    @SerialName("position")
    val position: Int,
    @SerialName("product_count")
    val productCount: Int
)