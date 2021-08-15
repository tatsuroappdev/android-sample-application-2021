package com.tatsuro.app.androidsampleapplication2021

import android.app.Application
import android.os.StrictMode
import androidx.fragment.app.strictmode.FragmentStrictMode

@Suppress("unused")
class DebugApplication : Application() {

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

        val fragmentPolicy = FragmentStrictMode.Policy.Builder()
            .detectFragmentReuse()
            .detectFragmentTagUsage()
            .detectRetainInstanceUsage()
            .detectSetUserVisibleHint()
            .detectTargetFragmentUsage()
            .detectWrongFragmentContainer()
            .penaltyLog()
            .build()
        FragmentStrictMode.setDefaultPolicy(fragmentPolicy)
    }
}
