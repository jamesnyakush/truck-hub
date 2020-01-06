package com.jamesnyakush.carhub.ui.home.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesnyakush.carhub.data.repos.HistoryRepository

@Suppress("UNCHECKED_CAST")
class HistoryViewModelFactory(
    private val repository: HistoryRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HistoryViewModel(repository) as T
    }
}