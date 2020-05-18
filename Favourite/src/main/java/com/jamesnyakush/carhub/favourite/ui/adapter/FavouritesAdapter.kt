package com.jamesnyakush.carhub.favourite.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.carhub.R
import kotlinx.android.synthetic.main.item_home.view.*


/*class FavouritesAdapter(
    val trucks: List<Truck>
) : RecyclerView.Adapter<FavouritesAdapter.FavouriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FavouriteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        )

    override fun getItemCount() = trucks.size

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        val trucks = trucks[position]

//        holder.v.name.text = trucks.name
//        holder.v.reg.text = trucks.reg
        holder.v.manu.text = trucks.manufacturer
    }


    class FavouriteViewHolder(val v: View) : RecyclerView.ViewHolder(v)

}*/