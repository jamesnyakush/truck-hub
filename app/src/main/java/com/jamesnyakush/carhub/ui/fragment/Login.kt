package com.jamesnyakush.carhub.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.databinding.LoginFragmentBinding
import com.jamesnyakush.carhub.ui.viewmodel.LoginViewModel

internal class Login : Fragment(R.layout.login_fragment) {

    private lateinit var binding: LoginFragmentBinding
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = LoginFragmentBinding.bind(view)
        binding.viewmodel = viewModel

        /*binding.login.setOnClickListener {
            Intent(requireContext(), MainActivity::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
            }
        }*/

        /* viewModel.getLoggedInUser().observe(this, Observer {user->
             if (user != null) {
                 Intent(this, MainActivity::class.java).also {
                     it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                     startActivity(it)
                 }
             }
         })*/

//        NotificationHelper.displayNotification(requireContext(), "jaes", "hello")
    }

}
