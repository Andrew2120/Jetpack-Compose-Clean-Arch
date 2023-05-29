package com.example.btechrevamp.ui

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.btechrevamp.domain.model.ProductModel
import com.example.btechrevamp.ui.states.UIState
import com.example.btechrevamp.ui.widgets.Product
import kotlinx.coroutines.flow.StateFlow

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductsScreen(
    mProducts: StateFlow<List<ProductModel>>,
    mState: StateFlow<UIState>,
) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            verticalItemSpacing = 2.dp,
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            content = {
                items(mProducts.value) { product ->
                    Product(
                        product
                    )
                }
            },
            modifier = Modifier.fillMaxSize()
        )
        when (val state = mState.collectAsState().value) {
            is UIState.Init -> {}
            is UIState.IsLoading -> {
                if (state.isLoading) {
                    CircularProgressIndicator()
                }
            }

            is UIState.ShowToast -> {
                Text(text = "Something went wrong !")
            }
        }
    }

}