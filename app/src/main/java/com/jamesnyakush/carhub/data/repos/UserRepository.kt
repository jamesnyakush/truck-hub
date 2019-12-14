package com.jamesnyakush.carhub.data.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesnyakush.carhub.data.network.SafeApiRequest

class UserRepository : SafeApiRequest(){
   suspend fun userLogin(email: String, password: String): LiveData<String> {

        val loginResponse = MutableLiveData<String>()

        return loginResponse
    }
}
