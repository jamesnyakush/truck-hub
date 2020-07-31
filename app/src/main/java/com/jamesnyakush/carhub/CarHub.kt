package com.jamesnyakush.carhub

import android.app.Application
import com.jamesnyakush.carhub.util.pref.SessionManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class CarHub : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
        initStetho()
        initTimber()
    }

    private fun initKoin() {
        TODO("Not yet implemented")
    }

    private fun initStetho() {
        TODO("Not yet implemented")
    }

    private fun initTimber() {
        TODO("Not yet implemented")
    }


}