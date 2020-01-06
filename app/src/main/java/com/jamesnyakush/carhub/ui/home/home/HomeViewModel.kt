package com.jamesnyakush.carhub.ui.home.home

import androidx.lifecycle.ViewModel
import com.jamesnyakush.carhub.data.repos.TruckRepository
import com.jamesnyakush.carhub.util.coroutines.lazyDeferred

class HomeViewModel(
    repository: TruckRepository
) : ViewModel() {

    val trucks by lazyDeferred {
        repository.getTrucks()
    }

}