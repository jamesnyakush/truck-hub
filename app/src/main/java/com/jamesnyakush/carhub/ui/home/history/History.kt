package com.jamesnyakush.carhub.ui.home.history

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.adapter.HistoryAdapter
import com.jamesnyakush.carhub.util.coroutines.Coroutines
import kotlinx.android.synthetic.main.history_fragment.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class History : Fragment(), KodeinAware {
    override val kodein by kodein()
    private val factory: HistoryViewModelFactory by instance()

    private lateinit var viewModel: HistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.history_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, factory).get(HistoryViewModel::class.java)
        bindUI()
    }

    private fun bindUI() = Coroutines.main {

       val history = viewModel.history.await()

//        hist_recycler.apply {
//            layoutManager = LinearLayoutManager(context)
//            hasFixedSize()
////            adapter = HistoryAdapter(history)
//        }
    }

}
