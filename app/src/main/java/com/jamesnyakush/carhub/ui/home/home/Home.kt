package com.jamesnyakush.carhub.ui.home.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.adapter.HomeAdapter
import com.jamesnyakush.carhub.data.db.entity.Truck
import com.jamesnyakush.carhub.util.CustomGridLayoutManager
import com.jamesnyakush.carhub.util.coroutines.Coroutines
import com.jamesnyakush.carhub.util.toast
import kotlinx.android.synthetic.main.home_fragment.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance


class Home : Fragment(), KodeinAware {
    override val kodein by kodein()
    private val factory: HomeViewModelFactory by instance()

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this, factory).get(HomeViewModel::class.java)
        bindUI()

    }

    private fun bindUI() = Coroutines.main {
        val mTrucks = viewModel.trucks.await()

        mTrucks.observe(viewLifecycleOwner, Observer {trucks->
            main_recycler.apply {
                layoutManager = CustomGridLayoutManager(requireContext(), 2)
                hasFixedSize()
                adapter = HomeAdapter(trucks)
            }
        })
    }
}