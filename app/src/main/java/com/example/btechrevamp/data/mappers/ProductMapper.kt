package com.example.btechrevamp.data.mappers

import com.example.btechrevamp.data.dto.Product
import com.example.btechrevamp.data.dto.ProductsBaseResponse
import com.example.btechrevamp.domain.model.ProductModel

fun Product.toDomain(): ProductModel {
    return ProductModel(
        id = id,
        price = price.toDouble(),
        sku = sku,
        title = name
    )
}