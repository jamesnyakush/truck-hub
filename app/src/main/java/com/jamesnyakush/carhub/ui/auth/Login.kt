package com.jamesnyakush.carhub.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.databinding.ActivityLoginBinding
import com.jamesnyakush.carhub.util.fcm.NotificationHelper
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein

class Login : AppCompatActivity(), KodeinAware {
    override val kodein by kodein()
//    private val factory: AuthViewModelFactory by instance()

    //    lateinit var viewModel: AuthViewModel
    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
//        viewModel = ViewModelProviders.of(this, factory).get(AuthViewModel::class.java)

//        binding.viewmodel = viewModel
        /*   viewModel.authListener = this

           viewModel.getLoggedInUser().observe(this, Observer {user->
               if (user != null) {
                   Intent(this, MainActivity::class.java).also {
                       it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                       startActivity(it)
                   }
               }
           })*/

        NotificationHelper.displayNotification(this, "jaes", "hello")

    }

/*
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

 */

}
