package com.jamesnyakush.carhub

import android.app.Application
import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.network.NetworkConnectionInterceptor
import com.jamesnyakush.carhub.data.network.RetrofitBuilder
import com.jamesnyakush.carhub.data.repos.HistoryRepository
import com.jamesnyakush.carhub.data.repos.HomeRepository
import com.jamesnyakush.carhub.data.repos.PaymentRepository
import com.jamesnyakush.carhub.data.repos.UserRepository
import com.jamesnyakush.carhub.ui.auth.AuthViewModelFactory
import com.jamesnyakush.carhub.ui.history.HistoryViewModelFactory
import com.jamesnyakush.carhub.ui.home.HomeViewModelFactory
import com.jamesnyakush.carhub.ui.payment.PaymentViewModel
import com.jamesnyakush.carhub.ui.payment.PaymentViewModelFactory
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
        bind() from  singleton { HomeRepository(instance()) }
        bind() from  singleton { HistoryRepository(instance()) }


        bind() from provider { AuthViewModelFactory(instance()) }
        bind() from provider { PaymentViewModelFactory(instance()) }
        bind() from provider { HomeViewModelFactory(instance()) }
        bind() from provider { HistoryViewModelFactory(instance()) }

    }
}