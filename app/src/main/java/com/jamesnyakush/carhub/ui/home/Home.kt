package com.jamesnyakush.carhub.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.adapter.HomeAdapter
import com.jamesnyakush.carhub.data.model.HomeModel
import kotlinx.android.synthetic.main.home_fragment.*


class Home : Fragment() {

    companion object{
        fun newInstance() = Home()
    }

    private lateinit var  viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        
        val trucks = listOf(
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania"),
            HomeModel("Masti","1222","Scania")
        )


        main_recycler.apply {
            layoutManager = LinearLayoutManager(context)
            hasFixedSize()
            adapter  = HomeAdapter(trucks
            )
        }

    }


}
