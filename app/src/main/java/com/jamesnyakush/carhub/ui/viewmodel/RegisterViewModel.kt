package com.jamesnyakush.carhub.ui.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel

internal class RegisterViewModel : ViewModel(){
    var email: String? = null
    var password: String? = null
    var name: String? = null


    fun onSignupButtonClick(view: View) {
//        if (email.isNullOrEmpty() || password.isNullOrEmpty() || name.isNullOrEmpty()) {
//            authListener?.onFailiure("All Fields are Required")
//            return
//        }
//
//        Coroutines.main {
//
//            try {
//                val authResponse = repository.userSignup(name!!,email!!,password!!)
//
//                authResponse.user?.let {
//                    authListener?.onSuccess(it)
//                    repository.saveUser(it)
//                    return@main
//                }
//                authListener?.onFailiure(authResponse.message!!)
//            }catch (e: ApiException){
//                authListener?.onFailiure(e.message!!)
//            }
//
//        }


    }


    fun onLogin(view: View) {
//        Intent(view.context, Login::class.java).also {
//            view.context.startActivity(it)
//        }
    }
}