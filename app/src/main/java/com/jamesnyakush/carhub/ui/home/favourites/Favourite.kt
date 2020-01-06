package com.jamesnyakush.carhub.ui.home.favourites

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.adapter.FavouritesAdapter
import kotlinx.android.synthetic.main.favourite_fragment.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class Favourite : Fragment(), KodeinAware {
    override val kodein by kodein()
    private val factory: FavouriteViewModelFactory by instance()

    private lateinit var viewModel: FavouriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favourite_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, factory).get(FavouriteViewModel::class.java)

//        val trucks = viewModel.trucks
//
//        fav_recycler.apply {
//
//            layoutManager = LinearLayoutManager(context)
//            hasFixedSize()
//            adapter = FavouritesAdapter(trucks)
//
//        }
    }

}
