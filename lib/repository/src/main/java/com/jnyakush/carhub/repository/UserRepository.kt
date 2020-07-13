package com.jnyakush.carhub.repository

/*
import com.jnyakush.carhub.data.db.AppDatabase
import com.jnyakush.carhub.data.db.entity.User
import com.jnyakush.carhub.network.network.RetrofitBuilder
import com.jnyakush.carhub.network.network.SafeApiRequest
import com.jnyakush.carhub.network.network.response.AuthResponse*/

/*
class UserRepository : SafeApiRequest() {
   private lateinit var db :  AppDatabase

    suspend fun userLogin(
        email: String,
        password: String
    ): AuthResponse {
        return apiRequest { RetrofitBuilder.apiService.userLogin(email, password) }
    }

    suspend fun userSignup(
        name: String,
        email: String,
        password: String
    ): AuthResponse {
        return apiRequest{ RetrofitBuilder.apiService.userSignup(name,email,password)}

    }

    suspend fun saveUser(user: User) = db.getUserDao().upsert(user)

    fun getUser() = db.getUserDao().getUser()
}
*/