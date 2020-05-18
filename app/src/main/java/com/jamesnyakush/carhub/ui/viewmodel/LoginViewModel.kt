package com.jamesnyakush.carhub.ui.viewmodel

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.jamesnyakush.carhub.ui.activity.main.MainActivity
import com.jamesnyakush.carhub.ui.fragment.LoginDirections


internal class LoginViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null

//    fun getLoggedInUser() = repository.getUser()


    fun onLoginButtonClick(view: View) {

        Intent(view.context, MainActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            view.context.startActivity(it)
        }
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
        val action = LoginDirections.actiontoRegister()
        Navigation.findNavController(view).navigate(action)
    }


}