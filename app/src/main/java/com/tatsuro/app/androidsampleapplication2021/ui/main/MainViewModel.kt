package com.tatsuro.app.androidsampleapplication2021.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val message = MutableStateFlow("")

    fun onResetButtonClick() {
        message.value = ""
    }

    fun onCrashButtonClick() {
        error("Crash test.")
    }
}
