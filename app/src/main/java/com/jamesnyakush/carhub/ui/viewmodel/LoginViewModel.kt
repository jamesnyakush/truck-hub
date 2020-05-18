package com.jamesnyakush.carhub.ui.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel


internal class LoginViewModel : ViewModel(){
    var email: String? = null
    var password: String? = null
    var name: String? = null

//    fun getLoggedInUser() = repository.getUser()


    fun onLoginButtonClick(view: View) {
//        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
//            view.context.toast("Email  and Password should not be empty")
//            return
//        }
//        FirebaseInstanceId.getInstance().instanceId
//            .addOnCompleteListener(OnCompleteListener{ task ->
//                if (!task.isSuccessful) {
//                    val token = task.result?.token
//
//                    return@OnCompleteListener
//                }
//
//            })
//        Coroutines.main {
//            try {
//                val authResponse = repository.userLogin(email!!, password!!)
//                authResponse.user?.let {
//                    authListener?.onSuccess(it)
//                    repository.saveUser(it)
//                    return@main
//                }
//                authListener?.onFailiure(authResponse.message!!)
//            } catch (e: ApiException) {
//                authListener?.onFailiure(e.message!!)
//
//            }
//        }


    }



    fun onRegister(view: View) {
//        Intent(view.context, Register::class.java).also {
//            view.context.startActivity(it)
//        }
    }



}