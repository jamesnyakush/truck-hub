package com.jamesnyakush.carhub.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.databinding.LoginFragmentBinding
import com.jamesnyakush.carhub.ui.activity.main.MainActivity
import com.jamesnyakush.carhub.ui.viewmodel.LoginViewModel
import com.jamesnyakush.core.network.Status
import com.jamesnyakush.core.toast

internal class Login : Fragment(R.layout.login_fragment) {

    private lateinit var binding: LoginFragmentBinding
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = LoginFragmentBinding.bind(view)
        binding.viewmodel = viewModel

        observeLoginResult()


        /*
            viewModel.getLoggedInUser().observe(this, Observer {user->
                 if (user != null) {
                     Intent(this, MainActivity::class.java).also {
                         it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                         startActivity(it)
                     }
                 }
             })
         */
    }

    private fun observeLoginResult() {
        /*
        viewModel.loginResult.observe(viewLifecycleOwner, Observer {result->
            if (result.status == Status.LOADING) {
               /*
               CatLoadingView().show(
                    childFragmentManager,
                    ""
                )
                */
            }
            when (result.status) {
                Status.SUCCESS -> {
                    Intent(context, MainActivity::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }
                    activity?.finish()
                }
                Status.ERROR -> {
                    if (result.exception != null) {
                        context?.toast(result!!.exception!!.message.toString())
                    } else {
                        context?.toast("Error has Occured")
                    }
                }
                Status.LOADING -> {
                }
            }
        })

         */
    }

}
