package com.jamesnyakush.carhub.ui.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.jamesnyakush.carhub.ui.fragment.LoginDirections
import com.jamesnyakush.carhub.util.ApiException
import com.jamesnyakush.carhub.util.coroutines.Coroutines
import com.jamesnyakush.core.network.EmptyResource
import com.jamesnyakush.core.toast

class LoginViewModel : ViewModel() {

    /*
      private val userRepository by lazy {
           UserRepository()
       }
     */
    var email: String? = null
    var password: String? = null

    //fun getLoggedInUser() = repository.getUser()

    val loginResult by lazy {
        MutableLiveData<EmptyResource>()
    }


    fun onLoginButtonClick(view: View) {

        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            view.context?.toast("Email prefix is required and password")
            return
        }

        loginResult.value = EmptyResource.loading()


        /*
          FirebaseInstanceId.getInstance().instanceId
              .addOnCompleteListener(OnCompleteListener{ task ->
                  if (!task.isSuccessful) {
                      val token = task.result?.token

                      return@OnCompleteListener
                  }

              })
          */
        /*
         Coroutines.main {
             try {
                 val authResponse = userRepository.userLogin(email!!, password!!)

                 authResponse.user?.let {
                     view.context.toast(it.toString())
                     userRepository.saveUser(it)
                     loginResult.value = EmptyResource.success()
                     return@main
                 }

                 loginResult.value = EmptyResource.error()

                 view.context.toast(authResponse.message!!)
             } catch (e: ApiException) {
                 view.context.toast(e.message!!)

             }
         }
        */
        loginResult.value = EmptyResource.success()

    }


    fun onRegister(view: View) {
        val action = LoginDirections.actiontoRegister()
        Navigation.findNavController(view).navigate(action)
    }


}