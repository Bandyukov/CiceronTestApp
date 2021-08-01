package com.example.ciceron

import android.app.Application
import com.example.ciceron.di.DaggerAppComponent

class CiceronApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        DI.appComponent = DaggerAppComponent.builder().appContext(this).build()
    }
}