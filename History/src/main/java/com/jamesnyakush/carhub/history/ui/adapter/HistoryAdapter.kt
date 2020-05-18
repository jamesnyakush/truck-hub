package com.jamesnyakush.carhub.history.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.carhub.R
import kotlinx.android.synthetic.main.item_home.view.*

/*class HistoryAdapter(
    val trucks: List<Truck>
) : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HistoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        )

    override fun getItemCount() = trucks.size

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val trucks = trucks[position]

//        holder.v.name.text = trucks.name
//        holder.v.reg.text = trucks.reg
        holder.v.manu.text = trucks.manufacturer
    }

    class HistoryViewHolder(val v: View) : RecyclerView.ViewHolder(v)

}*/