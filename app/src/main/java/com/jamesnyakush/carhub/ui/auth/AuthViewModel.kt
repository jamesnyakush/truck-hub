package com.jamesnyakush.carhub.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.jamesnyakush.carhub.data.listeners.AuthListener
import com.jamesnyakush.carhub.data.repos.UserRepository

class AuthViewModel(private val userRepository: UserRepository) : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            return
        }
        val loginResponse = userRepository.userLogin(email!!, password!!)
    }
}