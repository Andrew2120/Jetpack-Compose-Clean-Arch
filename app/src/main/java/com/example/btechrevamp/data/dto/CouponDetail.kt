package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CouponDetail(
    @SerialName("discount_type")
    val discountType: String,
    @SerialName("discount_value")
    val discountValue: Int,
    @SerialName("final_discount")
    val finalDiscount: Int
)