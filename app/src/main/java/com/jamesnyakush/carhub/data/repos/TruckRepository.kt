package com.jamesnyakush.carhub.data.repos

import android.annotation.SuppressLint
import android.os.Build
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.db.entity.Truck
import com.jamesnyakush.carhub.data.network.RetrofitBuilder
import com.jamesnyakush.carhub.data.network.SafeApiRequest
import com.jamesnyakush.carhub.util.coroutines.Coroutines
import com.jamesnyakush.carhub.util.pref.SessionManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit


class TruckRepository(
    private val db: AppDatabase,
    private val prefs: SessionManager
) : SafeApiRequest() {

    private val trucks = MutableLiveData<List<Truck>>()

    init {
        trucks.observeForever {
            saveTruck(it)
        }
    }

    suspend fun getTrucks(): LiveData<List<Truck>> {
        return withContext(Dispatchers.IO) {
            fetchTrucks()
            db.getTruckDao().getTrucks()
        }
    }

    private suspend fun fetchTrucks() {
        val lastSavedAt = prefs.getLastSavedAt()

        if (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                lastSavedAt == null || isFetchNeeded(LocalDateTime.parse(lastSavedAt))
            } else {
                TODO("VERSION.SDK_INT < O")
            }
        ) {

            val response = apiRequest { RetrofitBuilder.apiService.getTrucks() }

            trucks.postValue(response.trucks)
        }
    }

    @SuppressLint("NewApi")
    private fun isFetchNeeded(savedAt: LocalDateTime): Boolean {
        return ChronoUnit.HOURS.between(savedAt,LocalDateTime.now()) > 6
    }

    private fun saveTruck(trucks: List<Truck>) {
        Coroutines.io {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                prefs.savelastSavedAt(LocalDateTime.now().toString())
            }
            db.getTruckDao().saveTruck(trucks)
        }

    }


}