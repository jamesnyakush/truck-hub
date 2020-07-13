package com.jamesnyakush.carhub.payment.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.carhub.payment.R


internal class PaymentAdapter : RecyclerView.Adapter<PaymentAdapter.PaymentViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PaymentViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_payment,parent,false)
    )

    override fun getItemCount() = 0

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {
    }

    inner class PaymentViewHolder(view: View) : RecyclerView.ViewHolder(view)
}