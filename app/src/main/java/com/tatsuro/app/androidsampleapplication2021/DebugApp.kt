package com.tatsuro.app.androidsampleapplication2021

import android.app.Application
import android.os.StrictMode
import dagger.hilt.android.HiltAndroidApp

@Suppress("unused")
@HiltAndroidApp
class DebugApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeStrictMode()
    }

    private fun initializeStrictMode() {
        val threadPolicy = StrictMode.ThreadPolicy.Builder()
            .detectDiskReads()
            .detectDiskWrites()
            .penaltyLog()
            .build()
        StrictMode.setThreadPolicy(threadPolicy)

        val vmPolicy = StrictMode.VmPolicy.Builder()
            .detectActivityLeaks()
            .detectLeakedClosableObjects()
            .detectLeakedSqlLiteObjects()
            .penaltyLog()
            .build()
        StrictMode.setVmPolicy(vmPolicy)
    }
}
