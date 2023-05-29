package com.example.btechrevamp.data.repo

import arrow.core.Either
import com.example.btechrevamp.data.ApiDataSource
import com.example.btechrevamp.data.dto.ProductsBaseResponse
import com.example.btechrevamp.data.mappers.toDomain
import com.example.btechrevamp.domain.model.ProductModel
import com.example.btechrevamp.domain.repo.BtechRepo
import io.ktor.client.call.body
import io.ktor.http.HttpStatusCode

class BtechRepoImpl(private val apiDataSource: ApiDataSource) : BtechRepo {
    override suspend fun getProducts(
        categoryId: Int,
        page: Int,
    ): Either<Exception, List<ProductModel>> {
        val results = apiDataSource.getProducts(categoryId, page)
        return when (results.status) {
            HttpStatusCode.OK -> {
                val response = results.body<ProductsBaseResponse>()
                Either.Right(response.products.map {
                    it.toDomain()
                })
            }

            else -> {
                Either.Left(Exception())
            }
        }
    }
}