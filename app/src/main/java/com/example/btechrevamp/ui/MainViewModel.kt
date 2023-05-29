package com.example.btechrevamp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.btechrevamp.domain.model.ProductModel
import com.example.btechrevamp.domain.use_cases.GetProductsUseCase
import com.example.btechrevamp.ui.states.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch


class MainViewModel(private val useCase: GetProductsUseCase) : ViewModel() {
    private val state = MutableStateFlow<UIState>(UIState.Init)
    val mState = state.asStateFlow()

    private val products = MutableStateFlow<List<ProductModel>>(mutableListOf())
    val mProducts = products.asStateFlow()

    private fun setLoading() {
        state.value = UIState.IsLoading(true)
    }

    private fun hideLoading() {
        state.value = UIState.IsLoading(false)
    }

    private fun showToast(message: String) {
        state.value = UIState.ShowToast(message)
    }


    init {
        viewModelScope.launch {
            useCase(355, 1)
                .onStart {
                    setLoading()
                }
                .catch {
                    hideLoading()
                    showToast(it.toString())

                }
                .collect { result ->
                    hideLoading()
                    products.value = result


                }
        }

    }
}

