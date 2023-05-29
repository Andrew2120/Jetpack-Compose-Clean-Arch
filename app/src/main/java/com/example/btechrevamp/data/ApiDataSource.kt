package com.example.btechrevamp.data

import com.example.btechrevamp.data.EndPoints.CATEGORIES
import com.example.btechrevamp.data.dto.ProductsBaseResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
import io.ktor.http.appendPathSegments

class ApiDataSource(private val client: HttpClient) {
    suspend fun getProducts(
        categoryId: Int,
        page: Int,
    ): HttpResponse {

        return client.get(CATEGORIES) {
            url {
                appendPathSegments(categoryId.toString(), page.toString(), "30")
            }

        }

    }
}