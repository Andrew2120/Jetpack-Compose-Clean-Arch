package com.example.btechrevamp.domain.model

data class ProductModel(
    val id: Int,
    val sku: String,
    val title: String,
    val price: Double,
    val image: String = "https://picsum.photos/200/300"
)
