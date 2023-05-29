package com.example.btechrevamp

import android.app.Application
import com.example.btechrevamp.di.appModule
import com.example.btechrevamp.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BtechApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@BtechApp)
            modules(networkModule, appModule)
        }

    }
}