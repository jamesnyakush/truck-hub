package com.jamesnyakush.carhub.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.jamesnyakush.carhub.data.listeners.AuthListener
import com.jamesnyakush.carhub.data.repos.UserRepository
import com.jamesnyakush.carhub.util.ApiException
import com.jamesnyakush.carhub.util.coroutines.Coroutines

class AuthViewModel(
    private val repository: UserRepository
) : ViewModel() {

    var email: String? = null
    var password: String? = null
    var name: String? = null

    var authListener: AuthListener? = null

    fun getLoggedInUser() = repository.getUser()


    fun onLoginButtonClick(view: View) {
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailiure("Email  and Password should not be empty")
            return
        }
//        FirebaseInstanceId.getInstance().instanceId
//            .addOnCompleteListener(OnCompleteListener{ task ->
//                if (!task.isSuccessful) {
//                    val token = task.result?.token
//
//                    return@OnCompleteListener
//                }
//
//            })
        Coroutines.main {
            try {
                val authResponse = repository.userLogin(email!!, password!!)
                authResponse.user?.let {
                    authListener?.onSuccess(it)
                    repository.saveUser(it)
                    return@main
                }
                authListener?.onFailiure(authResponse.message!!)
            } catch (e: ApiException) {
                authListener?.onFailiure(e.message!!)

            }
        }


    }


    fun onSignupButtonClick(view: View) {
        if (email.isNullOrEmpty() || password.isNullOrEmpty() || name.isNullOrEmpty()) {
            authListener?.onFailiure("All Fields are Required")
            return
        }

        Coroutines.main {

            try {
                val authResponse = repository.userSignup(name!!,email!!,password!!)

                authResponse.user?.let {
                    authListener?.onSuccess(it)
                    repository.saveUser(it)
                    return@main
                }
                authListener?.onFailiure(authResponse.message!!)
            }catch (e: ApiException){
                authListener?.onFailiure(e.message!!)
            }

        }


    }

    fun onRegister(view: View) {
        Intent(view.context, Register::class.java).also {
            view.context.startActivity(it)
        }
    }

    fun onLogin(view: View) {
        Intent(view.context, Login::class.java).also {
            view.context.startActivity(it)
        }
    }




}