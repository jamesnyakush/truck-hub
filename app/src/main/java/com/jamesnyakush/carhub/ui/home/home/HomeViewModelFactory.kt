package com.jamesnyakush.carhub.ui.home.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesnyakush.carhub.data.repos.TruckRepository

@Suppress("UNCHECKED_CAST")
class HomeViewModelFactory(
    private val repository: TruckRepository
) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(repository) as T
    }
}