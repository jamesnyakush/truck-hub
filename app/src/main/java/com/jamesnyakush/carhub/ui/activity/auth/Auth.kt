package com.jamesnyakush.carhub.ui.activity.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamesnyakush.carhub.R

internal class Auth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.auth_activity)
    }
}
