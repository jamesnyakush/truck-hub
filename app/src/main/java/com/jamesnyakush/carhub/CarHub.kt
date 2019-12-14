package com.jamesnyakush.carhub

import android.app.Application
import com.jamesnyakush.carhub.data.repos.HomeRepository
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class CarHub : Application(), KodeinAware{
    override val kodein = Kodein.lazy {
        import(androidXModule(this@CarHub))

        bind() from singleton {  HomeRepository(instance())}
    }
}