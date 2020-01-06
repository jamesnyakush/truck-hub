package com.jamesnyakush.carhub.ui.home.history

import androidx.lifecycle.ViewModel
import com.jamesnyakush.carhub.data.repos.HistoryRepository
import com.jamesnyakush.carhub.util.coroutines.lazyDeferred

class HistoryViewModel(
    repository: HistoryRepository
) : ViewModel() {

    val history by lazyDeferred {

    }

}
