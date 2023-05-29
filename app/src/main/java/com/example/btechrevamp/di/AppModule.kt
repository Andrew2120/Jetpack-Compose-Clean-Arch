package com.example.btechrevamp.di

import com.example.btechrevamp.data.ApiDataSource
import com.example.btechrevamp.data.repo.BtechRepoImpl
import com.example.btechrevamp.domain.repo.BtechRepo
import com.example.btechrevamp.domain.use_cases.GetProductsUseCase
import com.example.btechrevamp.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {


    single {
        ApiDataSource(get())
    }
    single {
        GetProductsUseCase(get())
    }
    single<BtechRepo> { BtechRepoImpl(get()) }

    viewModel { MainViewModel(get()) }

}