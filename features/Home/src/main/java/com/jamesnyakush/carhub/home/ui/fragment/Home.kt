package com.jamesnyakush.carhub.home.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.home.R
import com.jamesnyakush.carhub.home.ui.viewmodel.HomeViewModel


internal class Home : Fragment(R.layout.home_fragment) {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
