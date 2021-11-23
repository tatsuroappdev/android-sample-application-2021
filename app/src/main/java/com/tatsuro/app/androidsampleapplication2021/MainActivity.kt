package com.tatsuro.app.androidsampleapplication2021

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.strictmode.FragmentStrictMode
import com.tatsuro.app.androidsampleapplication2021.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.main_activity) {

    init {
        initializeFragmentStrictMode()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    private fun initializeFragmentStrictMode() {
        if (!BuildConfig.DEBUG) {
            return
        }

        val fragmentPolicy = FragmentStrictMode.Policy.Builder()
            .detectFragmentReuse()
            .detectFragmentTagUsage()
            .detectRetainInstanceUsage()
            .detectSetUserVisibleHint()
            .detectTargetFragmentUsage()
            .detectWrongFragmentContainer()
            .penaltyLog()
            .build()
        supportFragmentManager.strictModePolicy = fragmentPolicy
    }
}
