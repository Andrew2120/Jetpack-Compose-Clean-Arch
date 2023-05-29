package com.example.btechrevamp.domain.use_cases

import arrow.core.Either
import arrow.core.right
import com.example.btechrevamp.domain.repo.BtechRepo
import kotlinx.coroutines.flow.flow

class GetProductsUseCase(private val repo: BtechRepo) {
    operator fun invoke(categoryID: Int, page: Int) = flow {
        repo.getProducts(categoryID, page).apply {
            when (this) {
                is Either.Left -> throw Exception()
                is Either.Right -> emit(this.value)
            }
        }
    }
}