package com.kmp.template

import android.app.Application
import com.kmp.template.di.initKoin
import org.koin.android.ext.koin.androidContext

class MainApp: Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@MainApp)
        }
    }
}