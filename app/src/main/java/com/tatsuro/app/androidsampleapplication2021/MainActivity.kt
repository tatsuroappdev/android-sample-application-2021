package com.tatsuro.app.androidsampleapplication2021

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tatsuro.app.androidsampleapplication2021.ui.main.MainFragment

class MainActivity : AppCompatActivity(R.layout.main_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
