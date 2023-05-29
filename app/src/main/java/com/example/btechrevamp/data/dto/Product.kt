package com.example.btechrevamp.data.dto


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Product(
    @SerialName("attributes")
    val attributes: List<Attribute>,
    @SerialName("brand")
    val brand: String,
    @SerialName("btech_simple_bundle")
    val btechSimpleBundle: Int,
    @SerialName("cart_discount")
    val cartDiscount: String,
    @SerialName("cart_promo_code")
    val cartPromoCode: String,
    @SerialName("category")
    val category: String,
    @SerialName("category_tag")
    val categoryTag: List<CategoryTag>,
    @SerialName("category_tag_list")
    val categoryTagList: List<CategoryTag>,
    @SerialName("coupon_details")
    val couponDetails: List<CouponDetail>,
    @SerialName("extra_services")
    val extraServices: @Contextual Any?,
    @SerialName("gift_product_sku")
    val giftProductSku: String,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("installment_options")
    val installmentOptions: List<InstallmentOption>,
    @SerialName("minicash")
    val minicash: List<Minicash>,
    @SerialName("minicash_campaign")
    val minicashCampaign: Int,
    @SerialName("minicash_interest_discount")
    val minicashInterestDiscount: String,
    @SerialName("name")
    val name: String,
    @SerialName("offer_badges")
    val offerBadges: List<@Contextual Any>,
    @SerialName("price")
    val price: Int,
    @SerialName("promotion_days_count")
    val promotionDaysCount: Int,
    @SerialName("regular_price")
    val regularPrice: Int,
    @SerialName("review_avg_score")
    val reviewAvgScore: Double,
    @SerialName("review_count")
    val reviewCount: Int,
    @SerialName("sku")
    val sku: String,
    @SerialName("special_from_date")
    val specialFromDate: String,
    @SerialName("special_tag")
    val specialTag: List<SpecialTag>,
    @SerialName("special_to_date")
    val specialToDate: String,
    @SerialName("specification")
    val specification: List<@Contextual Any>,
    @SerialName("tier_price")
    val tierPrice: List<TierPrice>,
    @SerialName("type")
    val type: String,
    @SerialName("winner_vendor_id")
    val winnerVendorId: Int
)