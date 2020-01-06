package com.jamesnyakush.carhub.ui.home.payment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesnyakush.carhub.data.repos.PaymentRepository

@Suppress("UNCHECKED_CAST")
class PaymentViewModelFactory(
    private val repository: PaymentRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PaymentViewModel(repository) as T
    }

}