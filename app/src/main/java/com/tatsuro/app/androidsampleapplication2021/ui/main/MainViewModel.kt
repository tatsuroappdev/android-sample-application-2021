package com.tatsuro.app.androidsampleapplication2021.ui.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel : ViewModel() {

    val message = MutableStateFlow("")

    fun onResetButtonClick() {
        message.value = ""
    }

    fun onCrashButtonClick() {
        error("Crash test.")
    }
}
