package com.jamesnyakush.carhub.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.data.db.entity.Truck
import kotlinx.android.synthetic.main.item_home.view.*


class HomeAdapter(
    val trucks: List<Truck>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HomeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        )

    override fun getItemCount() = trucks.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val trucks = trucks[position]

//        holder.v.name.text = trucks.name
//        holder.v.reg.text = trucks.reg
        holder.v.manu.text = trucks.manufacturer
    }

    class HomeViewHolder(val v: View) : RecyclerView.ViewHolder(v)

}
