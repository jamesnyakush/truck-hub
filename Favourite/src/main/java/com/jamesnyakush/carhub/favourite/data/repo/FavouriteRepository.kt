package com.jamesnyakush.carhub.favourite.data.repo

import androidx.lifecycle.MutableLiveData
import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.db.entity.Truck
import com.jamesnyakush.carhub.data.network.SafeApiRequest

internal class FavouriteRepository(
    private val db: AppDatabase
) : SafeApiRequest() {

    val favourite = MutableLiveData<List<Truck>>()

    init {
        favourite.observeForever{
            saveFavourite(it)
        }
    }


    private fun saveFavourite(favourites: List<Truck>?) {

    }

}