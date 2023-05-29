package com.example.btechrevamp.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InstallmentOption(
    @SerialName("admin_fee")
    val adminFee: Int,
    @SerialName("default_installments")
    val defaultInstallments: Int,
    @SerialName("discount_for_interest")
    val discountForInterest: Int,
    @SerialName("down_payment_amount")
    val downPaymentAmount: Int,
    @SerialName("interest_rate")
    val interestRate: Double,
    @SerialName("mandatory_downpayment")
    val mandatoryDownpayment: Int,
    @SerialName("minimum_down_payment")
    val minimumDownPayment: Int,
    @SerialName("months")
    val months: String,
    @SerialName("price_for_month")
    val priceForMonth: Int,
    @SerialName("recommended_downpayment_amount")
    val recommendedDownpaymentAmount: Int
)