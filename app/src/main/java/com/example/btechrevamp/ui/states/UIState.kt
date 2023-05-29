package com.example.btechrevamp.ui.states

sealed class UIState {
    object Init : UIState()
    data class IsLoading(val isLoading: Boolean) : UIState()
    data class ShowToast(val message: String) : UIState()
}