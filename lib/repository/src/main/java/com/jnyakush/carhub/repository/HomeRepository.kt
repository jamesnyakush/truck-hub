package com.jnyakush.carhub.repository

/*import android.annotation.SuppressLint
import android.os.Build
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jnyakush.carhub.data.db.AppDatabase
import com.jnyakush.carhub.data.db.entity.Truck
import com.jnyakush.carhub.network.network.RetrofitBuilder
import com.jnyakush.carhub.network.network.SafeApiRequest
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit*/

/*internal class HomeRepository(
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
        return ChronoUnit.HOURS.between(savedAt, LocalDateTime.now()) > 6
    }

    private fun saveTruck(trucks: List<Truck>) {
        Coroutines.io {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                prefs.savelastSavedAt(LocalDateTime.now().toString())
            }
            db.getTruckDao().saveTruck(trucks)
        }

    }


}*/