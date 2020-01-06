package com.jamesnyakush.carhub.ui.home.favourites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesnyakush.carhub.data.repos.FavouriteRepository

@Suppress("UNCHECKED_CAST")
class FavouriteViewModelFactory(
   private val repository: FavouriteRepository
) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FavouriteViewModel(repository) as T
    }
}