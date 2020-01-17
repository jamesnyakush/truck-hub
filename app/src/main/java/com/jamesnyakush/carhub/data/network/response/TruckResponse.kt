package com.jamesnyakush.carhub.data.network.response

import com.jamesnyakush.carhub.data.db.entity.Truck

data class  TruckResponse(
    val message: String,
    val trucks: List<Truck>
)