package com.jamesnyakush.carhub.data.listeners

import com.jamesnyakush.carhub.data.db.entity.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailiure(msg : String)
}