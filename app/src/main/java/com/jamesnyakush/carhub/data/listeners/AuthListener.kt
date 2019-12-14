package com.jamesnyakush.carhub.data.listeners

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailiure(msg : String)
}