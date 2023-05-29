package com.example.btechrevamp.domain.repo

import arrow.core.Either
import com.example.btechrevamp.domain.model.ProductModel

interface BtechRepo {

    suspend fun getProducts(categoryId: Int, page: Int): Either<Exception, List<ProductModel>>


}