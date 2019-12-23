package com.jamesnyakush.carhub.data.network.response

import com.jamesnyakush.carhub.data.db.entity.User

data class AuthResponse(
    val message: String?,
    val status: Boolean?,
    val user: User?
)