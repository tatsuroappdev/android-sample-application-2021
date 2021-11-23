package com.tatsuro.app.androidsampleapplication2021.ui.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    val message = MutableStateFlow("")

    fun onResetButtonClick() {
        message.value = ""
    }

    fun onCrashButtonClick() {
        error("Crash test.")
    }
}
