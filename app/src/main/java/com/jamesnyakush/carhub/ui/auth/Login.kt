package com.jamesnyakush.carhub.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.listeners.AuthListener
import com.jamesnyakush.carhub.ui.main.MainActivity
import com.jamesnyakush.carhub.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity(), AuthListener {

    lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
//        viewModel.authListener = this

        supportActionBar!!.hide()

        login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


    override fun onStarted() {
        toast("On started is called")
    }

    override fun onSuccess() {
        toast("On Success is called")
    }

    override fun onFailiure(msg: String) {
       toast(msg)
    }

}
