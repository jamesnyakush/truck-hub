package com.jamesnyakush.carhub.history.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.jamesnyakush.carhub.history.R
import com.jamesnyakush.carhub.history.ui.viewmodel.HistoryViewModel


internal class History : Fragment(R.layout.history_fragment) {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(HistoryViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
