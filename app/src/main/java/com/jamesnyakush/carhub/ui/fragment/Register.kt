package com.jamesnyakush.carhub.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.databinding.RegisterFragmentBinding
import com.jamesnyakush.carhub.ui.viewmodel.RegisterViewModel


internal class Register : Fragment(R.layout.register_fragment) {

    private lateinit var binding: RegisterFragmentBinding
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(RegisterViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = RegisterFragmentBinding.bind(view)
        binding.viewmodel = viewModel


        /*     viewModel = ViewModelProviders.of(this,factory).get(AuthViewModel::class.java)

     binding.viewmodel = viewModel
     viewModel.authListener = this

     viewModel.getLoggedInUser().observe(this, Observer { user ->
         if (user != null) {
             Intent(this, MainActivity::class.java).also {
                 it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                 startActivity(it)
             }
         }
     })*/
    }

}
