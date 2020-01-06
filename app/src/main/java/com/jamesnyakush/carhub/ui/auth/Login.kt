package com.jamesnyakush.carhub.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.db.entity.User
import com.jamesnyakush.carhub.data.listeners.AuthListener
import com.jamesnyakush.carhub.databinding.ActivityLoginBinding
import com.jamesnyakush.carhub.ui.home.main.MainActivity
import com.jamesnyakush.carhub.util.PrintToLog
import com.jamesnyakush.carhub.util.fcm.NotificationHelper
import com.jamesnyakush.carhub.util.snackbar
import com.jamesnyakush.carhub.util.toast
import kotlinx.android.synthetic.main.activity_login.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class Login : AppCompatActivity(), AuthListener, KodeinAware {
    override val kodein by kodein()
    private val factory: AuthViewModelFactory by instance()

    lateinit var viewModel: AuthViewModel
    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        viewModel = ViewModelProviders.of(this, factory).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this

        viewModel.getLoggedInUser().observe(this, Observer {user->
            if (user != null) {
                Intent(this, MainActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
            }
        })

        NotificationHelper.displayNotification(this,"jaes","hello")

    }


    override fun onStarted() {
        toast("On started is called")
    }

    override fun onSuccess(user: User) {
        login_layout.snackbar("${user.name} is Logged In")
    }

    override fun onFailiure(msg: String) {
        PrintToLog(msg)
        login_layout.snackbar(msg)
    }

}
