package com.example.btechrevamp.data.dto


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductsBaseResponse(
    @SerialName("active_filters")
    val activeFilters: List<@Contextual Any>,
    @SerialName("active_minicash_limit")
    val activeMinicashLimit: List<@Contextual Any>,
    @SerialName("children")
    val children: String,
    @SerialName("filters")
    val filters: List<Filter>,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("level")
    val level: Int,
    @SerialName("max_price")
    val maxPrice: Int,
    @SerialName("min_price")
    val minPrice: Int,
    @SerialName("minicash_entry")
    val minicashEntry: Int,
    @SerialName("minicash_limit")
    val minicashLimit: List<MinicashLimit>,
    @SerialName("name")
    val name: String,
    @SerialName("parent_id")
    val parentId: Int,
    @SerialName("position")
    val position: Int,
    @SerialName("products")
    val products: List<Product>,
    @SerialName("products_count")
    val productsCount: Int,
    @SerialName("sort_options")
    val sortOptions: List<SortOption>
)