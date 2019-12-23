package com.jamesnyakush.carhub.data.repos

import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.db.entity.User
import com.jamesnyakush.carhub.data.network.RetrofitBuilder
import com.jamesnyakush.carhub.data.network.SafeApiRequest
import com.jamesnyakush.carhub.data.network.response.AuthResponse

class UserRepository(
    private val db: AppDatabase
) : SafeApiRequest() {

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
