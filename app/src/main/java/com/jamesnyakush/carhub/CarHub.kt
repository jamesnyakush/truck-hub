package com.jamesnyakush.carhub

import android.app.Application
import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.network.NetworkConnectionInterceptor
import com.jamesnyakush.carhub.data.repos.*
import com.jamesnyakush.carhub.ui.auth.AuthViewModelFactory
import com.jamesnyakush.carhub.util.pref.SessionManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class CarHub : Application(), KodeinAware{
    override val kodein = Kodein.lazy {
        import(androidXModule(this@CarHub))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from  singleton { UserRepository(instance()) }
        bind() from  singleton { PaymentRepository(instance()) }
        bind() from singleton { SessionManager(instance()) }
        bind() from  singleton { TruckRepository(instance(),instance()) }
        bind() from  singleton { HistoryRepository(instance()) }
        bind() from singleton { FavouriteRepository(instance()) }

        bind() from provider { AuthViewModelFactory(instance()) }
//        bind() from provider { PaymentViewModelFactory(instance()) }
//        bind() from provider { HomeViewModelFactory(instance()) }
//        bind() from provider { HistoryViewModelFactory(instance()) }
//        bind() from provider { FavouriteViewModelFactory(instance()) }

    }
}